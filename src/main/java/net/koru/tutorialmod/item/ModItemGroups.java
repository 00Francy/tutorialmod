package net.koru.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.koru.tutorialmod.TutorialMod;
import net.koru.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {


    public static final ItemGroup KORU_MOD_TAB_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "koru_mod_tab"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TITANIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorialmod.koru_mod_tab"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                        entries.add(ModBlocks.TITANIUM_ORE);
                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }

}
