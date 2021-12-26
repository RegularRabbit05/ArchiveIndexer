package github.regularrabbit05.fileIndexer;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Indexer {
    public static void main(String[] args) {
    }

    public static boolean isSameDay(Date date1, Date date2) {
        LocalDate localDate1 = date1.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        LocalDate localDate2 = date2.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        return localDate1.isEqual(localDate2);
    }
}