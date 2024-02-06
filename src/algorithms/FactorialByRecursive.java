package algorithms;

public class FactorialByRecursive {


    public static int factorialOfNumber(int number){

        if (number == 1){
            return 1;

        }else{
            return  number *factorialOfNumber(number-1);
        }

    }
}
