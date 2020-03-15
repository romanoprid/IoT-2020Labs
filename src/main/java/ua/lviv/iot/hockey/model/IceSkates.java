package ua.lviv.iot.hockey.model;

public class IceSkates extends Good {
    private int bladeAmount;
    private double footSize;

    public IceSkates() {

    }

    public IceSkates(String name, double priceInUAH, String producer, String producingCountry, String material,
                     Purpose purpose, int bladeAmount, double footSize) {
        super(name, priceInUAH, producer, producingCountry, material, purpose);
        this.bladeAmount = bladeAmount;
        this.footSize = footSize;
    }

    public int getBladeAmount() {
        return bladeAmount;
    }

    public void setBladeAmount(int bladeAmount) {
        this.bladeAmount = bladeAmount;
    }

    public double getFootSize() {
        return footSize;
    }

    public void setFootSize(double footSize) {
        this.footSize = footSize;
    }


}
