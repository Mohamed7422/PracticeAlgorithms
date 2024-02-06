package algorithms;

public class SelectionSort {

      public static int[] selectionSort(int[] arrayNum) {

        for (int i  = 0; i < arrayNum.length-1;i++){
            int min = i;

            for (int j = i+1; j <arrayNum.length;j++){
                if (arrayNum[min]>arrayNum[j]){
                    min = j;
                }
            }

            int temp = arrayNum[i];
            arrayNum[i] = arrayNum[min];
            arrayNum[min] = temp;


        }

        return arrayNum;


    }
}
