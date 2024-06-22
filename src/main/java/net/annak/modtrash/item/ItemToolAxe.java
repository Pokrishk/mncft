package net.annak.modtrash.item;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;

public class ItemToolAxe extends AxeItem {
    public ItemToolAxe(String name) {
        super(Tiers.IRON, 6.0F, -3.1F, new Item.Properties().tab(ModCreativeModeTab.MODTRASH_TAB));
    }
}
