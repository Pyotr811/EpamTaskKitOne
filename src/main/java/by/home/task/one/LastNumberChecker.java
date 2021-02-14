package by.home.task.one;
import static java.lang.Math.*;

public class LastNumberChecker {

    public static int getLastDigit(int number){
        int lastDigit = 0;
        number = abs(number);
        if (number>=0 && number<=9){
            lastDigit = number;
        }else{
            lastDigit = number%10;
        }
        return lastDigit;

    }
    public static int squareOfNumber(int lastDigit){
        return (int) pow(lastDigit,2);
    }
}
