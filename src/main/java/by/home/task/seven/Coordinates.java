package by.home.task.seven;
import static java.lang.Math.*;

public class Coordinates {

    public static String comparePoints(int x1,int y1, int x2, int y2) {
        double firstPoint = getDistanceFromZeroPoint(x1, y1);
        double secondPoint = getDistanceFromZeroPoint(x2, y2);
        if (firstPoint>secondPoint){
            return "First point farther from the coordinates start!";
        }else if (firstPoint<secondPoint){
            return "Second point farther from the coordinates start!";
        }else{
            return "Points situate at the same distance from coordinates start!";
        }
    }

    public static double getDistanceFromZeroPoint(int x, int y) {
        return sqrt(pow(abs(x),2)+pow(abs(y),2));
    }
}
