package ua.lviv.iot.hockey.model;

public class ProtectiveClothes extends Good {
    private Level protectionLevel;

    public ProtectiveClothes() {

    }

    public ProtectiveClothes(final String name, final double priceInUAH, final String producer,
                             final String producingCountry,
                             final String material, final Purpose purpose, final Level protection) {
        super(name, priceInUAH, producer, producingCountry, material, purpose);
        this.protectionLevel = protection;
    }


    public final Level getProtectionLevel() {
        return protectionLevel;
    }

    public final void setProtectionLevel(final Level protection) {
        this.protectionLevel = protection;
    }
    @Override
    public String toString() {
        return super.toString() + " " +
                "ProtectionLevel=" + protectionLevel;
    }
}
