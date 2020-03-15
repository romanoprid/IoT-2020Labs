package ua.lviv.iot.hockey.model;


public class Uniform extends Good {
    private Size size;

    public Uniform() {

    }

    public Uniform(final String name, final double priceInUAH, final String producer, final String producingCountry,
                   final String material, final Purpose purpose, final Size uniformSize) {
        super(name, priceInUAH, producer, producingCountry, material, purpose);
        this.size = uniformSize;
    }

    public final Size getSize() {
        return size;
    }

    public final void setSize(final Size uniformSize) {
        this.size = uniformSize;
    }
    @Override
    public String toString() {
        return super.toString() + " " +
                "Size=" + size;
    }
}
