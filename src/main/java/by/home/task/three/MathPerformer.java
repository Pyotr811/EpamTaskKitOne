package by.home.task.three;

public class MathPerformer {

    public static double getSideFromArea(double area){
        return Math.sqrt(area);
    }
    public static double squareFromDiagonal(double diagonal){
        return (Math.pow(diagonal,2)/2);
    }
    public static double differenceOfSquare(double squareBig, double squareSmall){
        return squareBig/squareSmall;
    }
}
