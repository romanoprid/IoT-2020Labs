package ua.lviv.iot.hockey.model;

import java.util.*;

public class CompareByPrice implements Comparator<Good> {
    @Override
    public int compare(Good goods, Good t1) {
        return goods.getPriceInUAH() < t1.getPriceInUAH() ? -1 : goods.getPriceInUAH() == t1.getPriceInUAH() ? 0 : 1;
    }
}


