package proyect_metodos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class Metodos {

    public static boolean IsNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean IsDate(String dateStr) {
        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public static boolean IsTime(String timeStr) {
        try {
            LocalTime.parse(timeStr);
        } catch (DateTimeParseException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
