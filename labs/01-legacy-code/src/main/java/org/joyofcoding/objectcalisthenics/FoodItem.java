package org.joyofcoding.objectcalisthenics;

/**
 * Created by Rik_k on 27-3-2017.
 */
public class FoodItem implements ImplementItem{
    private String name;
    private int sellIn;
    private int quality;

    public FoodItem(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void updateQuality() {
        if (quality < 50) {
            quality++;
        }
        sellIn --;
        if(sellIn <0) {
            if (quality < 50) {
                quality++;
            }
        }
    }
    public int getQuality() {
        return quality;
    }

    public String getName() {
        return name;
    }
    public int getSellIn() {
        return sellIn;
    }
}
