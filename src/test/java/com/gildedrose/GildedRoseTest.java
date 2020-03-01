package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Goods[] items = new Goods[] { new Goods("foo", 1, 5) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("foo", app.goodsItems[0].name);
        assertThat(app.goodsItems[0].quality, is(4));
        assertThat(app.goodsItems[0].sell_in, is(0));
    }

}
