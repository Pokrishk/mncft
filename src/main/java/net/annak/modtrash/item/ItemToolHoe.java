package net.annak.modtrash.item;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;

public class ItemToolHoe extends HoeItem {
    public ItemToolHoe(String name) {
        super(Tiers.IRON, -2, -1.0F, new Item.Properties().tab(ModCreativeModeTab.MODTRASH_TAB));
    }
}
