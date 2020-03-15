package ua.lviv.iot.hockey.manager;

import ua.lviv.iot.hockey.model.*;

import java.util.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ClubManager {
    public class InnerCompareByName implements Comparator<Good> {
        @Override
        public int compare(Good goods, Good t1) {
            return goods.getName().compareTo(t1.getName());
        }
    }


    public static class InnerStaticCompareByPrice implements Comparator<Good> {
        @Override
        public int compare(Good goods, Good t1) {
            return goods.getPriceInUAH() < t1.getPriceInUAH() ? -1 : goods.getPriceInUAH() == t1.getPriceInUAH() ? 0 : 1;
        }
    }


    private List<Good> goods;

    public ClubManager() {
        this.goods = new LinkedList<Good>();
    }

    public void add(Good goods) {
        this.goods.add(goods);
    }

    public List<Good> find(Purpose purpose) {
        List<Good> res = new LinkedList<>();
        for (Good g : this.goods) {
            if (g.getPurpose() == purpose) {
                res.add(g);
            }
        }
        return res;
    }

    public void sortByName(boolean isIncrease) {
        if (isIncrease) {
            this.goods.sort(new CompareByName());
        } else {
            this.goods.sort(new CompareByNameDecrease());
        }
    }

    public void sortByPrice(boolean isIncrease) {
        if (isIncrease) {
            this.goods.sort(new CompareByPrice());
        } else {
            this.goods.sort(new CompareByPriceDecrease());
        }
    }

    public List<Good> findMinPrice(Purpose purpose) {
        List<Good> res = new LinkedList<>();
        List<Good> purposeGoods = new LinkedList<>();
        for (Good g : goods) {
            if (g.getPurpose() == purpose) {
                purposeGoods.add(g);
            }
        }
        Good minGood = Collections.min(purposeGoods, new CompareForFindPrice());
        Iterator<Good> it = goods.iterator();
        while (it.hasNext()) {
            Good g = it.next();
            if ((g.getPurpose() == purpose) && (g.getPriceInUAH() == minGood.getPriceInUAH())) {
                res.add(g);
            }
        }
        return res;
    }


    public void sortByProducer() {
        Collections.sort(goods, new Comparator<Good>() {
            @Override
            public int compare(Good o1, Good o2) {
                return o1.getProducer().compareTo(o2.getProducer());
            }
        });
    }

    public void sortByMaterial() {
        goods.sort((Good o1, Good o2) -> o1.getMaterial().compareTo(o2.getMaterial()));
    }


}
