package collection;

import java.util.LinkedList;

public class HashMap<T,V> {

    public static class Hash<T>{
        static int MAX = 100;
        LinkedList<Node<T>> map[] = new LinkedList[100];

        public Hash(){
            for(int i=0;i<MAX;i++){
                map[i] = new LinkedList<Node<T>>();
            }
        }

        public void put(String key,int value){
            map[key.hashCode()%MAX].add(new Node(key,value));
        }

        public T get(String key){
            LinkedList<Node<T>> list = map[key.hashCode()%MAX];

            for(Node<T> node:list){
                if(key.equals(node.key)){
                    return node.value;
                }
            }

            return null;
        }
    }

    public static class Node<T>{
        String key;
        T value;

        public Node(String key,T value){
            this.key = key;
            this.value = value;
        }
    }


    public static void main(String args[]){

    }

}
