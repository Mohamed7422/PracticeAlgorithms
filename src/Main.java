import algorithms.FactorialByRecursive;
import algorithms.RecursionDivideAndConguer;
import algorithms.SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        int arrayNum[] = {5,1,4,8,7,9,7};
//        int[] sortedArray = SelectionSort.selectionSort(arrayNum);
//
//        System.out.println(Arrays.toString(sortedArray));
//
//        int factorialOfNumber = FactorialByRecursive.factorialOfNumber(5);
//        System.out.println(factorialOfNumber);
        ArrayList<Integer> arrayNum = new ArrayList<Integer>();
        arrayNum.add(2);
        arrayNum.add(4);
        arrayNum.add(6);



        int maxOfList = RecursionDivideAndConguer.maximumOfAList(arrayNum,0 );
        System.out.println(maxOfList);

    }


//    int sumOfList = RecursionDivideAndConguer.sumOfList(arrayNum);
//        System.out.println(sumOfList);


}
