package sorting;



public class MergeSort {
    public static void sort(int arr[]) {
        mergeSort(arr,0,arr.length);
    }

    public static int[] mergeSort(int arr[],int start,int end){
        int[] left = mergeSort(arr,start,(start+end)/2);
        int[] right = mergeSort(arr,(start+end)/2,end);

        int[] arr1 = new int[2];


    }

    public static void main(String args[]) {

    }

}