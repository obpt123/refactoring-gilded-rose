package com.gildedrose;

import java.util.Arrays;

import com.gildedrose.goods.Goods;

class GildedRose {
    Goods[] goodsItems;

    public GildedRose(Goods[] items) {
        this.goodsItems = items;
    }

    public void updateGoodsInfos() {
        Arrays.stream(goodsItems).forEach(Goods::updateInfo);
    }

}
