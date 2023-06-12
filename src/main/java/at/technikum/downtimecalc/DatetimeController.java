package at.technikum.downtimecalc;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
public class DatetimeController {

    Datetime milo = new Datetime();

    @GetMapping("/api/today")
    public LocalDate date() {
        return milo.getDate();
    }
}
