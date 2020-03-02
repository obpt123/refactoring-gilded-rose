package com.gildedrose;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import com.gildedrose.goods.*;

import com.gildedrose.GoodsFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class GoodsTest {
    private final static String FOO_NAME = "foo";

    private final String inputName;

    private final int inputSellIn;

    private final int inputQuality;

    private final int expectedSellIn;

    private final int expectedQuality;

    @Parameters(name = "{index}: {0} with sellIn:{1} quality:{2} after update should be sellIn:{3} quality:{4}.")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { 
            { FOO_NAME, 1, 5, 0, 4 }, 
            { FOO_NAME, 0, 0, -1, 0 }, 
            { FOO_NAME, 20, 51, 19, 50 }, 
            { FOO_NAME, 20, 50, 19, 49 }, 
            { FOO_NAME, 20, 49, 19, 48 }, 
            { AgedBrie.NAME, 20, 52, 19, 52 }, 
            { AgedBrie.NAME, 20, 51, 19, 51 }, 
            { AgedBrie.NAME, 20, 50, 19, 50 }, 
            { AgedBrie.NAME, 20, 49, 19, 50 }, 
            { AgedBrie.NAME, 20, 48, 19, 49 }, 
            { AgedBrie.NAME, 20, 47, 19, 48 }, 
            { AgedBrie.NAME, 1, 52, 0, 52 }, 
            { AgedBrie.NAME, 1, 51, 0, 51 }, 
            { AgedBrie.NAME, 1, 50, 0, 50 }, 
            { AgedBrie.NAME, 1, 49, 0, 50 }, 
            { AgedBrie.NAME, 1, 48, 0, 49 }, 
            { AgedBrie.NAME, 1, 47, 0, 48 }, 
            { AgedBrie.NAME, 0, 52, -1, 52 }, 
            { AgedBrie.NAME, 0, 51, -1, 51 }, 
            { AgedBrie.NAME, 0, 50, -1, 50 }, 
            { AgedBrie.NAME, 0, 49, -1, 50 }, 
            { AgedBrie.NAME, 0, 48, -1, 50 }, 
            { AgedBrie.NAME, 0, 47, -1, 49 }, 
            { AgedBrie.NAME, 0, 46, -1, 48 },
            { Backstage.NAME, 20, 52, 19, 52 }, 
            { Backstage.NAME, 20, 51, 19, 51 }, 
            { Backstage.NAME, 20, 50, 19, 50 }, 
            { Backstage.NAME, 20, 49, 19, 50 }, 
            { Backstage.NAME, 20, 48, 19, 49 }, 
            { Backstage.NAME, 20, 47, 19, 48 }, 
            { Backstage.NAME, 20, 46, 19, 47 },

            { Backstage.NAME, 10, 52, 9, 52 }, 
            { Backstage.NAME, 10, 51, 9, 51 }, 
            { Backstage.NAME, 10, 50, 9, 50 }, 
            { Backstage.NAME, 10, 49, 9, 50 }, 
            { Backstage.NAME, 10, 48, 9, 50 }, 
            { Backstage.NAME, 10, 47, 9, 49 },
            { Backstage.NAME, 10, 46, 9, 48 }, 

            { Backstage.NAME, 5, 52, 4, 52 }, 
            { Backstage.NAME, 5, 51, 4, 51 }, 
            { Backstage.NAME, 5, 50, 4, 50 }, 
            { Backstage.NAME, 5, 49, 4, 50 }, 
            { Backstage.NAME, 5, 48, 4, 50 }, 
            { Backstage.NAME, 5, 47, 4, 50 },
            { Backstage.NAME, 5, 46, 4, 49 }, 

            { Backstage.NAME, 1, 52, 0, 52 }, 
            { Backstage.NAME, 1, 51, 0, 51 }, 
            { Backstage.NAME, 1, 50, 0, 50 }, 
            { Backstage.NAME, 1, 49, 0, 50 }, 
            { Backstage.NAME, 1, 48, 0, 50 }, 
            { Backstage.NAME, 1, 47, 0, 50 }, 
            { Backstage.NAME, 1, 46, 0, 49 }, 
            { Backstage.NAME, 0, 52, -1, 0 }, 
            { Backstage.NAME, 0, 51, -1, 0 }, 
            { Backstage.NAME, 0, 50, -1, 0 }, 
            { Backstage.NAME, 0, 49, -1, 0 }, 
            { Backstage.NAME, 0, 48, -1, 0 }, 
            { Backstage.NAME, 0, 47, -1, 0 }, 
            { Backstage.NAME, 0, 46, -1, 0 },

            { Sulfuras.NAME, 20, 52, 20, 52 }, 
            { Sulfuras.NAME, 20, 51, 20, 51 }, 
            { Sulfuras.NAME, 20, 50, 20, 50 }, 
            { Sulfuras.NAME, 20, 49, 20, 49 }, 
            { Sulfuras.NAME, 20, 48, 20, 48 }, 
            { Sulfuras.NAME, 20, 47, 20, 47 },
            { Sulfuras.NAME, 1, 52, 1, 52 }, 
            { Sulfuras.NAME, 1, 51, 1, 51 }, 
            { Sulfuras.NAME, 1, 50, 1, 50 }, 
            { Sulfuras.NAME, 1, 49, 1, 49 }, 
            { Sulfuras.NAME, 1, 48, 1, 48 }, 
            { Sulfuras.NAME, 1, 47, 1, 47 }, 
            { Sulfuras.NAME, 0, 52, 0, 52 }, 
            { Sulfuras.NAME, 0, 51, 0, 51 }, 
            { Sulfuras.NAME, 0, 50, 0, 50 }, 
            { Sulfuras.NAME, 0, 49, 0, 49 }, 
            { Sulfuras.NAME, 0, 48, 0, 48 }, 
            { Sulfuras.NAME, 0, 47, 0, 47 }, 
        });
    }

    public GoodsTest(String inputName, int inputSellIn, int inputQuality, int expectedSellIn, int expectedQuality) {
        this.inputName = inputName;
        this.inputSellIn = inputSellIn;
        this.inputQuality = inputQuality;
        this.expectedSellIn = expectedSellIn;
        this.expectedQuality = expectedQuality;
    }

    @Test
    public void shouldGetExpectedValueWhenUpdateInfoWithParams() {
        Goods goods = GoodsFactory.create(this.inputName, this.inputSellIn, this.inputQuality);
        goods.updateInfo();
        assertEquals("Name", this.inputName, goods.getName());
        assertEquals("SellIn", this.expectedSellIn, goods.getSellIn());
        assertEquals("Quality", this.expectedQuality, goods.getQuality());
    }

}
