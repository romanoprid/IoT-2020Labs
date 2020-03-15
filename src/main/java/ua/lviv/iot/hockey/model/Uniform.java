package ua.lviv.iot.hockey.model;


public class Uniform extends Good {
    private String category;
    private Size size;

    public Uniform() {

    }

    public Uniform(String name, double priceInUAH, String producer, String producingCountry, String material, Purpose purpose, String category, Size size) {
        super(name, priceInUAH, producer, producingCountry, material, purpose);
        this.category = category;
        this.size = size;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }


}
