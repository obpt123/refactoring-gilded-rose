package com.gildedrose.goods;


public class Backstage extends Goods {
    public final static String NAME = "Backstage passes to a TAFKAL80ETC concert";
    public Backstage(int sell_in, int quality) {
        super(NAME, sell_in, quality);
    }
    @Override
    public void updateInfo() {
        this.decreaseSellIn();
        this.increaseQualityIf(quality < 50);
        this.increaseQualityIf(sell_in < 10 && quality < 50);
        this.increaseQualityIf(sell_in < 5 && quality < 50);
        this.resetQualityIf(sell_in < 0);
    }
}