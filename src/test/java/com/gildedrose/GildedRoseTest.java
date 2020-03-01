package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class GildedRoseTest {

    @Test
    public void shouldEachGoodsItemBeCalledUpdateInfoWhenUpgradeGoodsInfos() {
        Goods goods1 = mock(Goods.class);
        Goods goods2 = mock(Goods.class);
        Goods[] items = new Goods[] { goods1, goods2 };
        GildedRose app = new GildedRose(items);
        app.updateGoodsInfos();
        verify(goods1, times(1)).updateInfo();
        verify(goods2, times(1)).updateInfo();
    }

}
