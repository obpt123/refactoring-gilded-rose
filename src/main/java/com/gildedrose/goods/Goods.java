package com.gildedrose.goods;

public class Goods {
    private final String name;

    protected int sellIn;

    protected int quality;

    public Goods(final String name, final int sellIn, final int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return this.name;
    }

    public int getSellIn() {
        return this.sellIn;
    }

    public int getQuality() {
        return this.quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateInfo() {
        this.decreaseSellIn();
        this.decreaseQualityIf(quality > 0);
        this.decreaseQualityIf(sellIn < 0 && quality > 0);
    }

    protected void decreaseSellIn() {
        this.sellIn--;
    }

    protected void increaseQualityIf(boolean condition) {
        if (condition) {
            this.quality++;
        }
    }

    protected void decreaseQualityIf(boolean condition) {
        if (condition) {
            this.quality--;
        }
    }

    protected void resetQualityIf(boolean condition) {
        if (condition) {
            this.quality = 0;
        }
    }
}
