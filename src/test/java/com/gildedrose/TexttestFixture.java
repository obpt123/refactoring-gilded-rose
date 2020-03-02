package com.gildedrose;

import com.gildedrose.goods.Goods;
import com.gildedrose.GoodsFactory;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Goods[] GoodsItems = new Goods[] {
                GoodsFactory.create("+5 Dexterity Vest", 10, 20), //
                GoodsFactory.create("Aged Brie", 2, 0), //
                GoodsFactory.create("Elixir of the Mongoose", 5, 7), //
                GoodsFactory.create("Sulfuras, Hand of Ragnaros", 0, 80), //
                GoodsFactory.create("Sulfuras, Hand of Ragnaros", -1, 80),
                GoodsFactory.create("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                GoodsFactory.create("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                GoodsFactory.create("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                GoodsFactory.create("Backstage passes to a TAFKAL80ETC concert", 1, 20),
                GoodsFactory.create("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(GoodsItems);

        int days = 3;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Goods goods : GoodsItems) {
                System.out.println(goods);
            }
            System.out.println();
            app.updateGoodsInfos();
        }
    }

}
