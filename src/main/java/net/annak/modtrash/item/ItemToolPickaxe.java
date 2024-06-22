package net.annak.modtrash.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;

public class ItemToolPickaxe extends PickaxeItem {
    public ItemToolPickaxe(String name) {
        super(Tiers.IRON, 1, -2.8F, new Item.Properties().tab(ModCreativeModeTab.MODTRASH_TAB));
    }
}
