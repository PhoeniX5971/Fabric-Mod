package net.phoenix.modtemp;

import net.fabricmc.api.ModInitializer;
import net.phoenix.modtemp.block.ModBlocks;
import net.phoenix.modtemp.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Modtemp implements ModInitializer {
	public static final String MOD_ID = "modtemp";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
