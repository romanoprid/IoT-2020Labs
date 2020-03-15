package ua.lviv.iot.hockey;


import org.junit.jupiter.api.Test;
import ua.lviv.iot.hockey.model.Level;
import ua.lviv.iot.hockey.model.ProtectiveClothes;
import ua.lviv.iot.hockey.model.Purpose;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProtectiveClothesTest {

    @Test
    public void testToString() {
        ProtectiveClothes protectiveClothes = new ProtectiveClothes("Helmet", 100, "Gan",
                "Ukraine",
                "Leather", Purpose.GOALKEEPER, Level.MEDIUM);
        String expected = "Name=Helmet PriceInUAH=100.0 Producer=Gan ProducingCountry=Ukraine Material=Leather Purpose=GOALKEEPER ProtectionLevel=MEDIUM";
        String actual = protectiveClothes.toString();
        assertEquals(expected, actual);
    }
}