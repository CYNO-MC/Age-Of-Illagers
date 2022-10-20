package net.itscyno.ageofillagers;

import net.fabricmc.api.ModInitializer;
import net.itscyno.ageofillagers.block.AoiBlocks;
import net.itscyno.ageofillagers.item.AoiItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AoiMain implements ModInitializer {
	public static final String MOD_ID =  "ageofillagers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AoiItems.registerAoiItems();
		AoiBlocks.registerAoiBlocks();
	}
}
