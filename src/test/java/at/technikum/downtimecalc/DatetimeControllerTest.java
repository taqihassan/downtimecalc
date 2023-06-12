package at.technikum.downtimecalc;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class DatetimeControllerTest {

    @Test
    void getDate() {
        //Arrange

        //Act
        Datetime milo = new Datetime();

        //Assert
        assertEquals(LocalDate.now(),milo.getDate());

    }

    @Test
    void getTime(){
        Datetime dateTime = new Datetime();
        assertEquals(LocalTime.now(),dateTime.getTime());
    }


}