package at.technikum.downtimecalc;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
public class DatetimeController {

    Datetime milo = new Datetime();

    @GetMapping("/api/today")
    public LocalDate date() {
        return milo.getDate();
    }

    @GetMapping("/api/now")
    public String formattedDate(@RequestParam(required = false) String format){
        if(format != null){
            DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern(format);
            return customFormatter.format(LocalTime.now());
        }
        else {
            return milo.getTime().toString();
        }
    }
}
