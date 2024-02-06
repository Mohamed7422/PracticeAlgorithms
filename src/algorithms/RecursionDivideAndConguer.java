package algorithms;

import java.util.ArrayList;
import java.util.List;

public class RecursionDivideAndConguer {

    public static int sumOfList(ArrayList<Integer>list){
        ArrayList<Integer> arrayL = list;
        if (list.size()==0){
            return 0;
        }else {
            int total  = arrayL.get(0);
            arrayL.remove(0);
            return total+sumOfList(arrayL);


        }

    }

    public static int sumOfList(ArrayList<Integer>list, int index){
        ArrayList<Integer> arrayL = list;
        if (list.size()==0){
            return 0;
        }else {

            return arrayL.get(0)+sumOfList(arrayL,index+1);


        }

    }

    public static int sizeOfList(ArrayList<Integer>list,int index){

        if (list == null || index>=list.size() ){
            return 0;
        }else {
            return 1 + sizeOfList(list,index+1);
        }

    }
    public static int sizeOfList(ArrayList<Integer>list){

        if (list == null|| list.isEmpty()){
            return 0;
        }else {
            list.remove(0);
            return 1 + sizeOfList(list);
        }

    }

    public static int maximumOfAList(ArrayList<Integer>list,int index){
        if (index>=list.size()){
            return 0; //base case
        }else {
            int max = list.get(index);

           int rMax =  maximumOfAList(list, index + 1); //recursive case(inductive case)

           if (rMax>max){
               max = rMax;
           }


            return max;
        }
    }
}
