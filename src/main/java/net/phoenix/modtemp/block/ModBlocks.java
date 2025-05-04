package net.phoenix.modtemp.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.phoenix.modtemp.Modtemp;

public class ModBlocks {

	public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
			new Block(AbstractBlock.Settings.create().strength(3.0f).requiresTool()));

	public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
			new Block(AbstractBlock.Settings.create().strength(4.0f).requiresTool()
					.sounds(BlockSoundGroup.AMETHYST_BLOCK)));

	public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore", new ExperienceDroppingBlock(
			UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(3f).requiresTool()));

	public static final Block PINK_GARNET_DEEPSLATE_ORE = registerBlock("pink_garnet_deepslate_ore",
			new ExperienceDroppingBlock(
					UniformIntProvider.create(3, 6),
					AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(Modtemp.MOD_ID, name), block);
	}

	private static void registerBlockItem(String name, Block block) {
		Registry.register(Registries.ITEM, Identifier.of(Modtemp.MOD_ID, name),
				new BlockItem(block, new Item.Settings()));
	}

	public static void registerModBlocks() {
		Modtemp.LOGGER.info("Mod blocks registered!");

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.add(RAW_PINK_GARNET_BLOCK);
			entries.add(PINK_GARNET_BLOCK);
		});
	}

}
