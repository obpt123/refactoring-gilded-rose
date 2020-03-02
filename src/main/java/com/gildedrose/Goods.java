package com.gildedrose;

public class Goods {
    private final static String AGEDBRIE_NAME = "Aged Brie";
    private final static String BACKSTAGE_NAME = "Backstage passes to a TAFKAL80ETC concert";
    private final static String SULFURAS_NAME = "Sulfuras, Hand of Ragnaros";
    private final String name;

    protected int sell_in;

    protected int quality;

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


    private void updateBackstageInfo() {
        this.decreaseSellIn();
        this.increaseQualityIf(quality < 50);
        this.increaseQualityIf(sell_in < 10 && quality < 50);
        this.increaseQualityIf(sell_in < 5 && quality < 50);
        this.resetQualityIf(sell_in < 0);
    }

    private void updateOthers() {
        this.decreaseSellIn();
        this.decreaseQualityIf(quality > 0);
        this.decreaseQualityIf(sell_in < 0 && quality > 0);
    }

    protected void decreaseSellIn() {
        this.sell_in--;
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
