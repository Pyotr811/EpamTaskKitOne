package by.home.task.three;

public class Main {

    public static void main(String[] args) {
        double areaOfBigSquare = 1;
        if (areaOfBigSquare > 0) {
            double sideOfBigSquare = MathPerformer.getSideFromArea(areaOfBigSquare);
            double areaOfSmallSquare = MathPerformer.squareFromDiagonal(sideOfBigSquare);

            System.out.println("Area of outside square: "+areaOfBigSquare+",\n" +
                    "Area of inside square: " +areaOfSmallSquare+",\n"+
                    "Area of little square less then big square at: "+ MathPerformer.differenceOfSquare(areaOfBigSquare,areaOfSmallSquare));
        }else {
            System.out.println("Area can not be null or negative number!");
        }
    }
}
