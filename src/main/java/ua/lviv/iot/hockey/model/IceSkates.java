package ua.lviv.iot.hockey.model;

public class IceSkates extends Good {
    private double footSize;

    public IceSkates() {

    }

    public IceSkates(final String name, final double priceInUAH, final String producer, final String producingCountry,
                     final String material, final Purpose purpose, double foot) {
        super(name, priceInUAH, producer, producingCountry, material, purpose);

        this.footSize = foot;
    }


    public final double getFootSize() {
        return footSize;
    }

    public final void setFootSize(final double foot) {
        this.footSize = foot;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "FootSize=" + footSize;
    }

}
