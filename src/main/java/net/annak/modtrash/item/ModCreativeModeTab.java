package net.annak.modtrash.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MODTRASH_TAB = new CreativeModeTab("modtrash_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CAT.get());
        }
    };
}
