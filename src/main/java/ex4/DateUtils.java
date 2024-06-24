package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public String format(String pattern, Date date) {
        return this.formateur.format(date);
    }

    public String formatDefaut(Date date) {
        return this.formateur.format(date);
    }
}
