package com.gildedrose;

import com.gildedrose.goods.AgedBrie;
import com.gildedrose.goods.Backstage;
import com.gildedrose.goods.Goods;
import com.gildedrose.goods.Sulfuras;

public class GoodsFactory {

    public static Goods create(final String name, final int sellIn, final int quality) {
        switch (name) {
        case AgedBrie.NAME:
            return new AgedBrie(sellIn, quality);
        case Sulfuras.NAME:
            return new Sulfuras(sellIn, quality);
        case Backstage.NAME:
            return new Backstage(sellIn, quality);
        default:
            return new Goods(name, sellIn, quality);
        }
    }
}