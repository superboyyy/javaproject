package gregoriancalender;

import java.util.GregorianCalendar;

public class gregorianCalender {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int year = gregorianCalendar.get(GregorianCalendar.YEAR);
        int month = gregorianCalendar.get(GregorianCalendar.MONTH) + 1;
        int day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("The current date is " + year + "/" + month + "/" + day);

        gregorianCalendar.setTimeInMillis(1234567898765L);

        year = gregorianCalendar.get(GregorianCalendar.YEAR);
        month = gregorianCalendar.get(GregorianCalendar.MONTH) + 1;
        day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("The current date is " + year + "/" + month + "/" + day);


    }

}
