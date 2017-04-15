package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());
    }

    public List<ImplementItem> makeItems() {
        List<ImplementItem> items = new ArrayList<ImplementItem>();
        items.add(new VestItem("+5 Dexterity Vest", 10, 20));
        items.add(new FoodItem("Aged Brie", 2, 0));
        items.add(new ElixerItem("Elixir of the Mongoose", 5, 7));
        items.add(new WeaponItem("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new TicketItem("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new ElixerItem("Conjured Mana Cake", 3, 6));
        return items;
    }

    public void updateQuality(List<ImplementItem> items) {
        for (ImplementItem item : items) {
            item.updateQuality();
        }
    }
}
