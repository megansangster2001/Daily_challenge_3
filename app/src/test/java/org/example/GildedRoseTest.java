package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void normalItemQualityDecreases() {
        Item[] items = new Item[]{new Item("burger", 10, 20)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(19, app.items[0].quality);
    }

    @Test
    void qualityCannotGoBelowZero() {
        Item[] items = new Item[]{new Item("steak", 10, 0)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(0, app.items[0].quality);
    }

    @Test
    void normalItemQualityDecreasesTwiceAsFastUseByDate() {
        Item[] items = new Item[]{new Item("chicken", 0, 10)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(8, app.items[0].quality);
    }
    @Test
    void agedBrieQualityIncreases() {
        Item[] items = new Item [] { new Item("Aged Brie", 10, 20) };
        GildedRose app = new GildedRose (items);

        app.updateQuality();

        assertEquals(21, app.items[0].quality);

    }

}

