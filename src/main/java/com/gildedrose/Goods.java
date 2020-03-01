package com.gildedrose;

public class Goods {

    private final String name;

    private int sell_in;

    private int quality;

    public Goods(final String name, final int sell_in, final int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    public String getName() {
        return this.name;
    }

    public int getSellIn() {
        return this.sell_in;
    }

    public int getQuality() {
        return this.quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sell_in + ", " + this.quality;
    }

    public void updateInfo() {
        if (isSulfuras()) {
            updateSulfurasInfo();
        } else if (isAgedBrie()) {
            updateAgedBrieInfo();
        } else {
            updateQuality();
            decreaseSellIn();
            reUpdateQualityWhenSellInLessThanZero();
        }

    }

    public void updateSulfurasInfo() {

    }

    public void updateAgedBrieInfo() {
        if (this.quality < 50) {
            this.quality = this.quality + 1;
        }
        this.decreaseSellIn();
        if (this.sell_in >= 0)
            return;
        if (this.quality < 50) {
            this.quality = this.quality + 1;
        }
    }

    private void updateQuality() {
        if (!isBackstage()) {
            if (this.quality > 0) {
                this.quality = this.quality - 1;
            }
        } else {
            if (this.quality < 50) {
                this.quality = this.quality + 1;

                if (this.sell_in < 11 && this.quality < 50) {
                    this.quality = this.quality + 1;
                }

                if (this.sell_in < 6 && this.quality < 50) {
                    this.quality = this.quality + 1;
                }

            }
        }
    }

    private void decreaseSellIn() {
        this.sell_in = this.sell_in - 1;
    }

    private boolean isAgedBrie() {
        return this.name.equals("Aged Brie");
    }

    private boolean isBackstage() {
        return this.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isSulfuras() {
        return this.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private void reUpdateQualityWhenSellInLessThanZero() {
        if (this.sell_in >= 0)
            return;

        if (!isBackstage()) {
            if (this.quality > 0) {
                this.quality = this.quality - 1;
            }
        } else {
            this.quality = 0;
        }

    }
}
