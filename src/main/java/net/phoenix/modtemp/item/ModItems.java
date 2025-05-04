package net.phoenix.modtemp.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.phoenix.modtemp.Modtemp;

public class ModItems {

	public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
	public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(Modtemp.MOD_ID, name), item);
	}

	public static void registerModItems() {
		Modtemp.LOGGER.info("Mod items registered!");

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.add(PINK_GARNET);
			entries.add(RAW_PINK_GARNET);
		});
	}
}
