package by.home.task.ten;
import static java.lang.Math.*;

public class TanPerformer {

    public static double doFunction(double x){
        return tan(x);
    }

    public static String getResult(int start, int end, int step) {
        String result = "";
        for (int i = start; i <end ; i+=step) {
            result = result.concat(i+" rad.    "+String.format("%.2f", TanPerformer.doFunction(i))+"\n");
        }
        return result;
    }
}
