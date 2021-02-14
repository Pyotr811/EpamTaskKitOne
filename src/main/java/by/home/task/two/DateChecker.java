package by.home.task.two;

public class DateChecker {

    public static String checkInputValues(int year, int numberOfMonth) {
        if (year < 3001 && year > 0) {
            if (numberOfMonth > 0 && numberOfMonth < 13) {
                return checkDate(year, numberOfMonth);
            } else {
                return "Wrong number of month!";
            }
        } else {
            return "Wrong number of year!";
        }
    }

    public static String checkDate(int year, int numberOfMonth) {
        String month = "";
        int amountOfDays = 0;
        switch (numberOfMonth) {
            case 1:
                month = "January";
                amountOfDays = 31;
                break;
            case 2:
                month = "February";
                if (year % 4 == 0) {
                    amountOfDays = 29;
                } else {
                    amountOfDays = 28;
                }
                break;
            case 3:
                month = "March";
                amountOfDays = 31;
                break;
            case 4:
                month = "April";
                amountOfDays = 30;
                break;
            case 5:
                month = "May";
                amountOfDays = 31;
                break;
            case 6:
                month = "June";
                amountOfDays = 30;
                break;
            case 7:
                month = "July";
                amountOfDays = 31;
                break;
            case 8:
                month = "August";
                amountOfDays = 31;
                break;
            case 9:
                month = "September";
                amountOfDays = 30;
                break;
            case 10:
                month = "October";
                amountOfDays = 31;
                break;
            case 11:
                month = "November";
                amountOfDays = 30;
                break;
            case 12:
                month = "December";
                amountOfDays = 31;
                break;
        }
        return "In " + month + " of " + year + " year is " + amountOfDays + " days!";
    }
}
