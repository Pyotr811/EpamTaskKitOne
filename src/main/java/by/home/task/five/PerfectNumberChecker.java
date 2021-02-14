package by.home.task.five;

public class PerfectNumberChecker {

    public static boolean isPerfectNumber(int number){
        int resultNumber = 0;
        if (number != 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    resultNumber += i;
                }
            }
            return resultNumber==number;
        }else{
            return false;
        }
    }
}
