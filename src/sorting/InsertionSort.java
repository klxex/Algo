package sorting;



public class InsertionSort {

    public static void sort(int arr[]){
       int len = arr.length;
       int key;
       for(int i=1;i<len;i++){
           key = arr[i];
           for(int j=i-1;j>=0;j--){
             if(key<arr[j]){
                 arr[j+1] = arr[j];
             }
             else{
                 arr[j+1] = key;
                 break;
             }
           }
       }

    }

    public static void main(String args[]){
        int a[] = {8,1,5,2,3,4,6};
        sort(a);

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
