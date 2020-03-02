package com.gildedrose.goods;


public class Backstage extends Goods {
    public final static String NAME = "Backstage passes to a TAFKAL80ETC concert";
    public Backstage(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }
    @Override
    public void updateInfo() {
        this.decreaseSellIn();
        this.increaseQualityIf(quality < 50);
        this.increaseQualityIf(sellIn < 10 && quality < 50);
        this.increaseQualityIf(sellIn < 5 && quality < 50);
        this.resetQualityIf(sellIn < 0);
    }
}