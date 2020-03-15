package ua.lviv.iot.hockey.model;

public class HockeyPuck extends Good {
    private double thickness;

    public HockeyPuck() {
    }

    public HockeyPuck(final String name, final double priceInUAH, final String producer, final String producingCountry,
                      final String material, final Purpose purpose, final double thick) {
        super(name, priceInUAH, producer, producingCountry, material, purpose);
        this.thickness = thick;

    }

    public final double getThickness() {
        return thickness;
    }

    public final void setThickness(final double thick) {
        this.thickness = thick;
    }

    @Override
    public  String toString() {
        return super.toString() + " " +
                "Thickness=" + thickness + " ";
    }

}
