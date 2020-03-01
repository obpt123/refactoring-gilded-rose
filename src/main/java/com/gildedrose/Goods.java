package com.gildedrose;

public class Goods {
    private final static String AGEDBRIE_NAME = "Aged Brie";
    private final static String BACKSTAGE_NAME = "Backstage passes to a TAFKAL80ETC concert";
    private final static String SULFURAS_NAME = "Sulfuras, Hand of Ragnaros";
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
        switch (this.name) {
            case SULFURAS_NAME:
                updateSulfurasInfo();
                break;
            case AGEDBRIE_NAME:
                updateAgedBrieInfo();
                break;
            case BACKSTAGE_NAME:
                updateBackstageInfo();
                break;
            default:
                updateOthers();
                break;
        }
    }

    private void updateSulfurasInfo() {
    }

    private void updateAgedBrieInfo() {
        this.sell_in = this.sell_in - 1;
        if (this.quality < 50) {
            this.quality = this.quality + 1;
        }
        if (this.sell_in < 0 && this.quality < 50) {
            this.quality = this.quality + 1;
        }
    }

    private void updateBackstageInfo() {
        this.sell_in = this.sell_in - 1;
        if (this.quality < 50) {
            this.quality = this.quality + 1;
            if (this.sell_in < 10 && this.quality < 50) {
                this.quality = this.quality + 1;
            }
            if (this.sell_in < 5 && this.quality < 50) {
                this.quality = this.quality + 1;
            }
        }
        if (this.sell_in < 0) {
            this.quality = 0;
        }
    }

    private void updateOthers() {
        this.sell_in = this.sell_in - 1;
        if (this.quality > 0) {
            this.quality = this.quality - 1;
        }
        if (this.sell_in < 0 && this.quality > 0) {
            this.quality = this.quality - 1;
        }
    }
}
