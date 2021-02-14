package by.home.task.four;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = -12;
        int c = 45;
        int d = 1;

        System.out.println("Do we have 2 or more positive numbers?");
        String result = EvenNumberChecker.numbersCheck(a,b,c,d) > 1?"true":"false";
        System.out.println("Answer is: "+result+".");
    }
}
