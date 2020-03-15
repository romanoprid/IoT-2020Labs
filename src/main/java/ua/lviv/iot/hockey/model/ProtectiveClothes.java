package ua.lviv.iot.hockey.model;

public class ProtectiveClothes extends Good {
    private Level protectionLevel;

    public ProtectiveClothes() {

    }

    public ProtectiveClothes(String name, double priceInUAH, String producer, String producingCountry, String material, Purpose purpose, Level protectionLevel) {
        super(name, priceInUAH, producer, producingCountry, material, purpose);
        this.protectionLevel = protectionLevel;
    }


    public Level getProtectionLevel() {
        return protectionLevel;
    }

    public void setProtectionLevel(Level protectionLevel) {
        this.protectionLevel = protectionLevel;
    }


}
