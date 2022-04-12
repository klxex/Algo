package sorting;

public class SelectionSort {
    public static void sort(int arr[]) {
        int len = arr.length;
        int pos;
        int temp;
        for(int i=0;i<len;i++){
            pos = i;

            for(int j=i;j<len;j++){
                if(arr[pos]>arr[j]){
                    pos = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;

        }
    }

    public static void main(String args[]) {
        int a[] = {8,1,5,2,3,4,6};
        sort(a);

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
