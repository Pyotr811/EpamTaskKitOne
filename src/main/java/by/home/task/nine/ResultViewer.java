package by.home.task.nine;

public class ResultViewer {

    public static String getCircleData(double radius) {
        String resultOne = String.format("%.2f", Circle.checkCircumference(radius));
        String resultTwo = String.format("%.2f", Circle.checkAreaOfCircle(radius));
        String result = "Radius of a circle: " + radius + ",\n" +
                "" + "Circumference: " + resultOne + ",\n" +
                "Area of a circle: " + resultTwo + ".";

        return result;
    }
}
