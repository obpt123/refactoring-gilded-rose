package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

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
        Goods goods = new Goods(this.inputName, this.inputSellIn, this.inputQuality);
        goods.updateInfo();
        assertEquals(goods.getName(), this.inputName);
        assertThat(goods.getSellIn(), is(this.expectedSellIn));
        assertThat(goods.getQuality(), is(this.expectedQuality));
    }

}
