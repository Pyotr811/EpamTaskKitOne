package by.home.task.four;

public class EvenNumberChecker {

    public static int numbersCheck(int a,int b, int c, int d){
        int counter = 0;
        int [] numbers = {a,b,c,d};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0){
                counter++;
            }
        }
        return counter;
    }
}
