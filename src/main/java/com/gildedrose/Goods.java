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
        } else if (isBackstage()) {
            updateBackstageInfo();
        } else {
            updateOthers();
        }
    }

    private void updateSulfurasInfo() {
    }

    private void updateAgedBrieInfo() {
        if (this.quality < 50) {
            this.quality = this.quality + 1;
        }
        this.sell_in = this.sell_in - 1;
        if (this.sell_in < 0 && this.quality < 50) {
            this.quality = this.quality + 1;
        }
    }

    private void updateBackstageInfo() {
        if (this.quality < 50) {
            this.quality = this.quality + 1;

            if (this.sell_in < 11 && this.quality < 50) {
                this.quality = this.quality + 1;
            }

            if (this.sell_in < 6 && this.quality < 50) {
                this.quality = this.quality + 1;
            }

        }
        this.sell_in = this.sell_in - 1;
        if (this.sell_in < 0) {
            this.quality = 0;
        }
    }

    private void updateOthers() {
        if (this.quality > 0) {
            this.quality = this.quality - 1;
        }
        this.sell_in = this.sell_in - 1;
        if (this.sell_in < 0 && this.quality > 0) {
            this.quality = this.quality - 1;
        }
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

}
