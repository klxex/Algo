package sorting;



public class MergeSort {
    public static int[] sort(int arr[]) {
        int ans[] = mergeSort(arr,0,arr.length);
        return ans;
    }

    public static int[] mergeSort(int arr[],int start,int end){
        if((end - start)==1){
            return new int[]{arr[start]};
        }

        int[] left = mergeSort(arr,start,(start+end)/2);
        int[] right = mergeSort(arr,(start+end)/2,end);

        int arr2[] = new int[end - start];
        int left_index = 0;
        int right_index = 0;

        for(int i=0;i<end-start;i++){
            if(left_index>=left.length){
                arr2[i] = right[right_index++];
            }
            else if(right_index>=right.length){
                arr2[i] = left[left_index++];
            }
            else if(left[left_index]<right[right_index]){
                arr2[i] = left[left_index++];
            }
            else{
                arr2[i] = right[right_index++];
            }
        }
        return arr2;
    }

    public static void main(String args[]) {
        int a[] = {8,1,5,2,3,4,6};
        int ans[] = sort(a);

        for(int s:ans){
            System.out.println(s);
        }
    }

}