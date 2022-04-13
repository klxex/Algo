package sorting;

public class QuickSort {

    public static void sort(int arr[]) {
        quickSort(arr,0,arr.length-1);
    }

    public static void quickSort(int arr[],int start,int end){
        if((end-start+1)<=1){
            return;
        }
        int pivot = arr[start];
        int s = start + 1;
        int e = end;
        int temp;

        while(s<=e){
            while(s<=end){
                if(pivot>arr[s]){
                    s++;
                }
                else{
                    break;
                }
            }

            while(e>=start){
                if(pivot<arr[e]){
                    e--;
                }
                else{
                    break;
                }
            }

            if(s>e){
                break;
            }
            temp = arr[e];
            arr[e] = arr[s];
            arr[s] = temp;
        }

        arr[start] = arr[e];
        arr[e] = pivot;

        quickSort(arr,start,e-1);
        quickSort(arr,e+1,end);

    }

    public static void main(String args[]) {
        int a[] = {8,1,5,2,3,4,6};
        sort(a);

        for(int b:a){
            System.out.println(b);
        }
    }
}
