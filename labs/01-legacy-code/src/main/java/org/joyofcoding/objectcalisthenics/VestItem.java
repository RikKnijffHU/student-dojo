package org.joyofcoding.objectcalisthenics;

import java.util.List;

public class VestItem implements ImplementItem {
    private String name;
    private int sellIn;
    private int quality;

    public VestItem(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void updateQuality() {
        if (quality > 0) {
            quality --;
        }

        sellIn --;
        if(sellIn < 0) {
            if(quality >0){
                quality--;
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
