package com.gildedrose;

public class Goods {

    public String name;

    public int sell_in;

    public int quality;

    public Goods(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sell_in + ", " + this.quality;
    }

    public void updateItemQuality() {
        if (!this.name.equals("Aged Brie")
                && !this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
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

        if (!this.name.equals("Sulfuras, Hand of Ragnaros")) {
            this.sell_in = this.sell_in - 1;
        }

        if (this.sell_in < 0) {
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
}
