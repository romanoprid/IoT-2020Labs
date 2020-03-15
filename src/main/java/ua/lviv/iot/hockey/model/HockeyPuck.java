package ua.lviv.iot.hockey.model;

public class HockeyPuck extends Good {
    private double thickness;
    private double radius;

    public HockeyPuck() {
    }

    public HockeyPuck(String name, double priceInUAH, String producer, String producingCountry, String material,
                      Purpose purpose, double thickness, double radius) {
        super(name, priceInUAH, producer, producingCountry, material, purpose);
        this.thickness = thickness;
        this.radius = radius;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
