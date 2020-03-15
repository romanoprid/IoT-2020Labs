package ua.lviv.iot.hockey.model;

import java.util.Comparator;

public class CompareByName implements Comparator<Good> {
    @Override
    public int compare(Good goods, Good t1) {
        return goods.getName().compareTo(t1.getName());
    }
}
