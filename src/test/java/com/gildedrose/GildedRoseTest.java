package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Goods[] items = new Goods[] { new Goods("foo", 1, 5) };
        GildedRose app = new GildedRose(items);
        app.updateGoodsInfos();
        assertEquals("foo", app.goodsItems[0].getName());
        assertThat(app.goodsItems[0].getQuality(), is(4));
        assertThat(app.goodsItems[0].getSellIn(), is(0));
    }

}
