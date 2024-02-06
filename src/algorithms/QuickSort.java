package algorithms;

public class QuickSort {


    public static void main(String[] args) {


        int[] arr = {5,4,8,2,1,6,7,9,3};

        quickSort(arr,0,arr.length-1);

        for (int element : arr) {
            System.out.print(" "+ element);
        }
    }

    private static void quickSort(int[] arr, int start, int end) {

        if (end<=start) return;
       int pivot =  partition(arr,start,end);

        quickSort(arr,start,pivot-1);
        quickSort(arr,pivot+1,end);
    }

    private static int partition(int[] arr, int start, int end) {

        int x = arr[end];
        int i = start - 1;
        for (int j = start; j<=end-1;j++){
            if (arr[j]<=x){
                i++;
                swap(arr,i,j);
            }
        }
//          i++;
        swap(arr,i+1,end);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        //suap arr[i] uith arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
