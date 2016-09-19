package ZellersCongruence;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String dayOfWeek;
        try {
            System.out.println("Please enter the date in (MM/dd/yyyy) format : ");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            String[] date = line.split("/");
            int month = Integer.valueOf(date[0]);
            int day = Integer.valueOf(date[1]);
            int year = Integer.valueOf(date[2]);

            //logic for January
            if (month == 1) {
                month = 13;
                year--;
            }
            //logic for February
            if (month == 2) {
                month = 14;
                year--;
            }


            int a = (13 * (month + 1) / 5);
            int b = (year / 4);
            int c = 6 * (int) (year / 100);
            int d = (year / 400);

            int e = a + b + c + d + year + day;
            e = e % 7;

            switch (e) {
                case 0:
                    dayOfWeek = "Saturday";
                    break;
                case 1:
                    dayOfWeek = "Sunday";
                    break;
                case 2:
                    dayOfWeek = "Monday";
                    break;
                case 3:
                    dayOfWeek = "Tuesday";
                    break;
                case 4:
                    dayOfWeek = "Wednesday";
                    break;
                case 5:
                    dayOfWeek = "Thursday";
                    break;
                case 6:
                    dayOfWeek = "Friday";
                    break;
                default:
                    dayOfWeek = "Invalid month";
                    break;
            }

            System.out.println("The day of the week is : " + dayOfWeek);
        }catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
}
    }
