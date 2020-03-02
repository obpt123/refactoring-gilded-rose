package com.gildedrose;

import com.gildedrose.goods.AgedBrie;
import com.gildedrose.goods.Backstage;
import com.gildedrose.goods.Goods;
import com.gildedrose.goods.Sulfuras;

public class GoodsFactory {

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