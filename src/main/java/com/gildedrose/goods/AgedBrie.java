package com.gildedrose.goods;


public class AgedBrie extends Goods {
    public final static String NAME = "Aged Brie";
    
    public AgedBrie(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }

    @Override
    public void updateInfo() {
        this.decreaseSellIn();
        this.increaseQualityIf(quality < 50);
        this.increaseQualityIf(sellIn < 0 && quality < 50);
    }
}