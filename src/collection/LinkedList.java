package collection;

public class LinkedList {

    static class List<T>{
        Node<T> head = null;
        Node<T> tail = null;

        public void addLast(T t){
            Node temp = null;
            if(this.head == null){
                temp = new Node<T>(t);
                head = temp;
                tail = temp;
            }
            else{
                temp = head;
                while(temp.next !=null){
                    temp = temp.next;
                }

                temp.next = new Node(t);
            }
        }

        public T remove(T t){
            Node<T> temp = null;
            Node<T> parent = null;

            if(head == null){
                return null;
            }
            else{
                temp = head;
                parent = null;

                while(!temp.t.equals(t)){
                    if(temp.next !=null){
                        parent = temp;
                        temp = temp.next;
                    }
                    else{
                        return null;
                    }
                }

                parent.next = temp.next;
                return temp.t;

            }


        }

        public int size(){
            if(this.head ==null){
                return 0;
            }
            else{
                Node temp = this.head;
                int size = 1;

                while(temp.next != null){
                    temp = temp.next;
                    size ++;
                }
                return size;
            }
        }
        public T get(int index){
            Node<T> temp = null;

            if(head ==null){
                return null;
            }
            else{
                temp = head;
                boolean isExist = true;

                for(int i=0;i<index;i++){
                    if(temp.next == null){
                        isExist = false;
                    }
                    temp = temp.next;
                }

                if(isExist){
                    return temp.t;
                }
                else{
                    return null;
                }
            }
        }

    }

    static class Node<T>{
        Node next;
        T t;

        public Node(T t){
            this.t = t;
        }

    }

    public static void main(String args[]){
        List<String> list = new List<String>();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.remove("b");

        System.out.println(list.size());

        for(int i=0;i<3;i++){
            System.out.println(list.get(1));
        }
    }
}
