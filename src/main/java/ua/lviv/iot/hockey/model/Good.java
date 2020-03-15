package ua.lviv.iot.hockey.model;

public class Good {
    private String name;
    private double priceInUAH;
    private String producer;
    private String producingCountry;
    private String material;
    private Purpose purpose;

    public Good() {

    }

    public Good(final String title, final double price, final String maker, final String producingTown,
                final String resource, final Purpose goal) {
        this.name = title;
        this.priceInUAH = price;
        this.producer = maker;
        this.producingCountry = producingTown;
        this.material = resource;
        this.purpose = goal;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String title) {
        this.name = title;
    }

    public final double getPriceInUAH() {
        return priceInUAH;
    }

    public final void setPriceInUAH(final double price) {
        this.priceInUAH = price;
    }

    public final String getProducer() {
        return producer;
    }

    public final void setProducer(final String maker) {
        this.producer = maker;
    }

    public final String getProducingCountry() {
        return producingCountry;
    }

    public final void setProducingCountry(final String producingTown) {
        this.producingCountry = producingTown;
    }

    public final String getMaterial() {
        return material;
    }

    public final void setMaterial(final String resources) {
        this.material = resources;
    }

    public final Purpose getPurpose() {
        return purpose;
    }

    public final void setPurpose(final Purpose goal) {
        this.purpose = goal;
    }

    @Override
    public String toString() {
        return
                "Name=" + name + ' ' +
                        "PriceInUAH=" + priceInUAH + ' ' +
                        "Producer=" + producer + ' ' +
                        "ProducingCountry=" + producingCountry + ' ' +
                        "Material=" + material + ' ' +
                        "Purpose=" + purpose;
    }
}
