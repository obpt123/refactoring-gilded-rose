package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Goods[] GoodsItems = new Goods[] {
                new Goods("+5 Dexterity Vest", 10, 20), //
                new Goods("Aged Brie", 2, 0), //
                new Goods("Elixir of the Mongoose", 5, 7), //
                new Goods("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Goods("Sulfuras, Hand of Ragnaros", -1, 80),
                new Goods("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Goods("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Goods("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Goods("Backstage passes to a TAFKAL80ETC concert", 1, 20),
                // this conjured Goods does not work properly yet
                new Goods("Conjured Mana Cake", 3, 6) };

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
            app.update_quality();
        }
    }

}
