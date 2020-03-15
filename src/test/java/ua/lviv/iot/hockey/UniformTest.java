package ua.lviv.iot.hockey;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.hockey.model.Purpose;
import ua.lviv.iot.hockey.model.Size;
import ua.lviv.iot.hockey.model.Uniform;

import static org.junit.Assert.assertEquals;

public class UniformTest {

    @Test
    public void testToString() {
        Uniform uniform = new Uniform("Sweater", 100, "North", "Ukraine",
                "Silk", Purpose.GOALKEEPER, Size.XL);
        String expected = "Name=Sweater PriceInUAH=100.0 Producer=North ProducingCountry=Ukraine Material=Silk Purpose=GOALKEEPER Size=XL";
        String actual = uniform.toString();
        Assertions.assertEquals(expected, actual);
    }
}
