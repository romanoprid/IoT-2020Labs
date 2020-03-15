package ua.lviv.iot.hockey;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.hockey.model.Good;
import ua.lviv.iot.hockey.model.Purpose;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoodTest {


    @Test
    public void testToString() {
        Good good = new Good("HockeyPuck", 100, "Gan", "Ukraine",
                "Leather", Purpose.GOALKEEPER);
        String expected = "Name=HockeyPuck PriceInUAH=100.0 Producer=Gan ProducingCountry=Ukraine Material=Leather Purpose=GOALKEEPER";
        String actual = good.toString();
        assertEquals(expected, actual);
    }
}