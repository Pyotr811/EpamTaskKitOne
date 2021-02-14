package by.home.task.six;

public class SecondsDivider {

    public static String divideSeconds(int secondsAmount) {
        String time = "Can not be negative!";
        if (secondsAmount > 0) {
            int hours = secondsAmount / 3600;
            secondsAmount -= (hours * 3600);
            int minutes = secondsAmount / 60;
            secondsAmount -= (minutes * 60);
            time = hours+":"+minutes+":"+secondsAmount+".";
        }
        return time;
    }
}
