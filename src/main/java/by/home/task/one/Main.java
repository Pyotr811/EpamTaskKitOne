package by.home.task.one;

public class Main {

    public static void main(String[] args) {
        int numberLastDigit = LastNumberChecker.getLastDigit(134);
        int squareOfLastDigit = LastNumberChecker.squareOfNumber(numberLastDigit);
        System.out.println("Last digit of our number: "+numberLastDigit+" ,\n" +
                "His square: "+squareOfLastDigit+" ,\n" +
                "Last digit of square: "+ LastNumberChecker.getLastDigit(squareOfLastDigit)+ ".");
    }
}
