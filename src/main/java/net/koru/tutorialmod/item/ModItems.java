package net.koru.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.koru.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public  static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new Item.Settings()));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }
    public static  void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for" + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TITANIUM_INGOT);
            entries.add(RAW_TITANIUM);
        });
    }
}
