package net.phoenix.modtemp.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.phoenix.modtemp.Modtemp;
import net.phoenix.modtemp.block.ModBlocks;

public class ModItemGroups {

	public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(Modtemp.MOD_ID, "pink_garnet_items"),
			FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
					.displayName(Text.translatable("itemGroup.modtemp.pink_garnet_items"))
					.entries((displayContext, entries) -> {
						entries.add(ModItems.PINK_GARNET);
						entries.add(ModItems.RAW_PINK_GARNET);
						entries.add(ModItems.CHISEL);
					})
					.build());

	public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(Modtemp.MOD_ID, "pink_garnet_blocks"),
			FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
					.displayName(Text.translatable("itemGroup.modtemp.pink_garnet_blocks"))
					.entries((displayContext, entries) -> {
						entries.add(ModBlocks.PINK_GARNET_BLOCK);
						entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

						entries.add(ModBlocks.PINK_GARNET_ORE);
						entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
					})
					.build());

	public static void registerItemGroups() {
		Modtemp.LOGGER.info("Mod item groups registered!");

	}

}
