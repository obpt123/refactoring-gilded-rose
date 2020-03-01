package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class GoodsTest {

    @Test
    public void shouldUpdateQualityAndSellInWhenUpdateInfo() {
        Goods fooGoods=  new Goods("foo", 1, 5) ;
        fooGoods.updateInfo();
        assertEquals("foo", fooGoods.getName());
        assertThat(fooGoods.getQuality(), is(4));
        assertThat(fooGoods.getSellIn(), is(0));
    }
    

}
