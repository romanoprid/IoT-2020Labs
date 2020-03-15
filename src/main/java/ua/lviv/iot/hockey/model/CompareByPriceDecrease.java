package ua.lviv.iot.hockey.model;

import java.util.Comparator;

public class CompareByPriceDecrease implements Comparator<Good> {


    @Override
    public final int compare(final Good goods, final Good t1) {
        return Double.compare(t1.getPriceInUAH(), goods.getPriceInUAH());
    }
}
