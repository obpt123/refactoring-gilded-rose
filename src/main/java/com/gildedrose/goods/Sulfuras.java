package com.gildedrose.goods;

import com.gildedrose.Goods;

public class Sulfuras extends Goods {
    public final static String NAME = "Sulfuras, Hand of Ragnaros";
    public Sulfuras(int sell_in, int quality) {
        super(NAME, sell_in, quality);
    }
    @Override
    public void updateInfo() {
    }
}