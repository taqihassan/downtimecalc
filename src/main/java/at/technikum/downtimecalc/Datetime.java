package at.technikum.downtimecalc;
import java.time.LocalDate;
import java.time.LocalTime;

public class Datetime {

    public LocalDate getDate() {
        return LocalDate.now();
    }

    public LocalTime getTime() {
        return LocalTime.now();
    }

}
