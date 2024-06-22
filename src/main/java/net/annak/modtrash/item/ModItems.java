package net.annak.modtrash.item;

import net.annak.modtrash.modtrash;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.property.Properties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, modtrash.MOD_ID);

    public static final RegistryObject<Item> CAT = ITEMS.register("cat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODTRASH_TAB)));
    public static final RegistryObject<Item> SILLY = ITEMS.register("sillycat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODTRASH_TAB)));
    public static final RegistryObject<Item> CUSTOM_AXE = ITEMS.register("custom_axe",
            () -> new ItemToolAxe("custom_axe"));
    public static final RegistryObject<Item> CUSTOM_HOE = ITEMS.register("custom_hoe",
            () -> new ItemToolHoe("custom_hoe"));
    public static final RegistryObject<Item> CUSTOM_PICKAXE = ITEMS.register("custom_pickaxe",
            () -> new ItemToolPickaxe("custom_pickaxe"));
    public static final RegistryObject<Item> CUSTOM_SPADE = ITEMS.register("custom_spade",
            () -> new ItemToolSpade("custom_spade"));
    public static final RegistryObject<Item> CUSTOM_SWORD = ITEMS.register("custom_sword",
            () -> new ItemBestSword("custom_sword"));
    public static final RegistryObject<Item> CUSTOM_HELMET = ITEMS.register("custom_helmet",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MODTRASH_TAB)));
    public static final RegistryObject<Item> CUSTOM_CHESTPLATE = ITEMS.register("custom_chestplate",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MODTRASH_TAB)));
    public static final RegistryObject<Item> CUSTOM_LEGGINGS = ITEMS.register("custom_leggings",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MODTRASH_TAB)));
    public static final RegistryObject<Item> CUSTOM_BOOTS = ITEMS.register("custom_boots",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MODTRASH_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}


