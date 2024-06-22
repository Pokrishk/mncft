package net.annak.modtrash.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tiers;

public class ItemToolSpade extends ShovelItem {
    public ItemToolSpade(String name) {
        super(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.MODTRASH_TAB));
    }
}
