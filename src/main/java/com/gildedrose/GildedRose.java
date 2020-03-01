package com.gildedrose;

import java.util.Arrays;

class GildedRose {
    Goods[] goodsItems;

    public GildedRose(Goods[] items) {
        this.goodsItems = items;
    }

    public void updateGoodsInfos() {
        Arrays.stream(goodsItems).forEach(Goods::updateInfo);
    }

}
