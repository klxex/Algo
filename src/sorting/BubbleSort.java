package sorting;

public class BubbleSort {

    public static void sort(int arr[]){
        int len = arr.length;
        int temp;

        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;

                }
            }
        }
    }

    public static void main(String args[]){
        int a[] = new int[]{1,5,2,3,4};
        sort(a);

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
