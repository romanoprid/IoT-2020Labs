package ua.lviv.iot.hockey;


import org.junit.Test;
import ua.lviv.iot.hockey.model.Purpose;
import ua.lviv.iot.hockey.model.Size;
import ua.lviv.iot.hockey.model.Uniform;


import static org.junit.Assert.*;

public class UniformTest {

    @Test
    public void testToString() {
        Uniform uniform = new Uniform("Sweater", 100, "North", "Ukraine",
                "Silk", Purpose.GOALKEEPER, "Torso", Size.XL);
        String expected = "Name=Sweater PriceInUAH=100.0 Producer=North ProducingCountry=Ukraine Material=Silk Purpose=GOALKEEPER Category=Torso Size=XL";
        String actual = uniform.toString();
        assertEquals(expected, actual);
    }
}
