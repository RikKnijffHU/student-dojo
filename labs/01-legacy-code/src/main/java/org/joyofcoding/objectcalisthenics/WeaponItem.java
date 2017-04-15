package org.joyofcoding.objectcalisthenics;

/**
 * Created by Rik_k on 27-3-2017.
 */
public class WeaponItem implements ImplementItem {
    private String name;
    private int sellIn;
    private int quality;

    public WeaponItem(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    @Override
    public void updateQuality() {

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
