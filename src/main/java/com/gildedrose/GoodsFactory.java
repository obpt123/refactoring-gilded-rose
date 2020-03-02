package com.gildedrose;

import com.gildedrose.goods.AgedBrie;
import com.gildedrose.goods.Backstage;
import com.gildedrose.goods.Sulfuras;

public class GoodsFactory {
    private final static String AGEDBRIE_NAME = "Aged Brie";
    private final static String BACKSTAGE_NAME = "Backstage passes to a TAFKAL80ETC concert";
    private final static String SULFURAS_NAME = "Sulfuras, Hand of Ragnaros";

    public static Goods create(final String name, final int sell_in, final int quality) {
        switch (name) {
        case AgedBrie.NAME:
            return new AgedBrie(sell_in, quality);
        case Sulfuras.NAME:
            return new Sulfuras(sell_in, quality);
        case Backstage.NAME:
            return new Backstage(sell_in, quality);
        default:
            return new Goods(name, sell_in, quality);
        }
    }
}