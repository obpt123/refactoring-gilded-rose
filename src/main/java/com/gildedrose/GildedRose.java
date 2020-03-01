package com.gildedrose;

class GildedRose {
    Goods[] goodsItems;

    public GildedRose(Goods[] items) {
        this.goodsItems = items;
    }

    public void updateGoodsInfos() {
        for (int i = 0; i < goodsItems.length; i++) {
            goodsItems[i].updateInfo();
        }
    }

    
    
}
