package ua.lviv.iot.hockey.model;

import java.util.Comparator;

public class CompareByNameDecrease implements Comparator<Good> {
    @Override
    public int compare(Good goods, Good t1) {
        return goods.getName().compareTo(t1.getName()) > 0 ? -1 : goods.getName().compareTo(t1.getName()) < 0 ? 1 : 0;
    }
}

