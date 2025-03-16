package net.koru.tutorialmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.koru.tutorialmod.TutorialMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(5.0F,6.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            new Block(AbstractBlock.Settings.create()
                .strength(5.0F,6.0F)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)));

    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new Block(AbstractBlock.Settings.create()
                .strength(5.0F,6.0F)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Mod Blocks for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
            entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
            entries.add(ModBlocks.TITANIUM_ORE);
        });
    }
}
