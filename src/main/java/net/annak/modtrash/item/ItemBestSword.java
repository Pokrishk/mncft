package net.annak.modtrash.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class ItemBestSword extends SwordItem {
    public ItemBestSword(String name) {
        super(Tiers.IRON, 3, -2.4F, new Item.Properties().tab(ModCreativeModeTab.MODTRASH_TAB));
    }
}
