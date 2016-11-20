package ru.vetalshev.date;

import java.util.Scanner;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Вывести фамилию разработчика, дату и время получения задания, а также
// дату и время сдачи задания.
public class TaskManager {

    private static final Pattern VALID_DATE_PATTERN = Pattern.compile("^[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}$");

    private static final String WRONG_DATE_FORMAT_MESSAGE = "===WRONG DATE FORMAT!!!===";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type task name & press <Enter>:");
        String taskName = scan.nextLine();

        System.out.println("Type user name & press <Enter>:");
        String userName = scan.nextLine();

        String startDate = null;
        String finishDate = null;

        // ??? Terrible compilation output [RESOLVED]
        while (true) {
            System.out.println("Type the task start date in format yyyy-mm-dd:");
            startDate = scan.nextLine();

            if (isValidDate2(startDate)) {
                break;
            } else {
                System.out.println(WRONG_DATE_FORMAT_MESSAGE);
            }
        }

        while (true) {
            System.out.println("Type the task finish date in format yyyy-mm-dd:");
            finishDate = scan.nextLine();

            if (isValidDate2(startDate)) { // ??? What method is faster, isValidDate() or isValidDate2()?
                break;
            } else {
                System.out.println(WRONG_DATE_FORMAT_MESSAGE);
            }
        }

        scan.close();

        System.out.println("====================");
        System.out.println("Task: " + taskName);
        System.out.println("User: " + userName);
        System.out.println("Start date: " + startDate);
        System.out.println("Finish date: " + finishDate);
        System.out.println("====================");
    }

    public static boolean isValidDate(String dateString) {
        Matcher m = VALID_DATE_PATTERN.matcher(dateString);
        // ??? if VALID_DATE_PATTERN isn't static compilator throws exception:
        // "Non-static variable VALID_DATE_PATTERN cannot be referenced from a static context"
        // What is a strange restriction?

        return m.matches();
    }

    public static boolean isValidDate2(String dateString) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            df.parse(dateString);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

//    Calendar cal = Calendar.getInstance();
//    cal.setLenient(false);
//        cal.setTime(yourDate);
//        try {
//        cal.getTime();
//        }
//        catch (Exception e) {
//        System.out.println("Invalid date");
//        }