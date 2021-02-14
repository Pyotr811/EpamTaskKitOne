package by.home.task.eight;

public class ResultViewer {

    public static String getResult(double number) {
        double result = (number>=3) ? FunctionPerformer.doFirstFunction(number):
                FunctionPerformer.doSecondFunction(number);
        return "Result: " + String.format("%.4f",result) + ".";
    }
}
