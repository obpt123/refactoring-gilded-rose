package com.gildedrose.goods;

import com.gildedrose.Goods;

public class AgedBrie extends Goods {
    public final static String AGEDBRIE_NAME = "Aged Brie";
    public AgedBrie(int sell_in, int quality) {
        super(AGEDBRIE_NAME, sell_in, quality);
    }
    @Override
    public void updateInfo() {
        this.decreaseSellIn();
        this.increaseQualityIf(quality < 50);
        this.increaseQualityIf(sell_in < 0 && quality < 50);
    }
}