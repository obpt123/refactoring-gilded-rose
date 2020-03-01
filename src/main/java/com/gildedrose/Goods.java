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
        updateQuality();
        decreaseSellIn();
        reUpdateQualityWhenSellInLessThanZero();
    }
    private void updateQuality(){
        if (!this.name.equals("Aged Brie") && !this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (this.quality > 0) {
                if (!this.name.equals("Sulfuras, Hand of Ragnaros")) {
                    this.quality = this.quality - 1;
                }
            }
        } else {
            if (this.quality < 50) {
                this.quality = this.quality + 1;

                if (this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (this.sell_in < 11) {
                        if (this.quality < 50) {
                            this.quality = this.quality + 1;
                        }
                    }

                    if (this.sell_in < 6) {
                        if (this.quality < 50) {
                            this.quality = this.quality + 1;
                        }
                    }
                }
            }
        }
    }
    private void decreaseSellIn() {
        if (!this.name.equals("Sulfuras, Hand of Ragnaros")) {
            this.sell_in = this.sell_in - 1;
        }
    }
    private void reUpdateQualityWhenSellInLessThanZero() {
        if (this.sell_in >= 0)
            return;
        if (!this.name.equals("Aged Brie")) {
            if (!this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (this.quality > 0) {
                    if (!this.name.equals("Sulfuras, Hand of Ragnaros")) {
                        this.quality = this.quality - 1;
                    }
                }
            } else {
                this.quality = this.quality - this.quality;
            }
        } else {
            if (this.quality < 50) {
                this.quality = this.quality + 1;
            }
        }
    }
}
