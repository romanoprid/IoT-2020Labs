package ua.lviv.iot.hockey.model;



import java.util.Comparator;

public class CompareForFindPrice implements Comparator<Good> {
    @Override
    public int compare(Good good, Good t1) {
        return good.getPriceInUAH() < t1.getPriceInUAH() ? -1 : good.getPriceInUAH() > t1.getPriceInUAH() ? 1 : 0;
    }
}
