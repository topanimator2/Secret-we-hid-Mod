package net.abit.secrets_that_we_hid;

import net.abit.secrets_that_we_hid.item.ModItems;
import net.abit.secrets_that_we_hid.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecretsThatWeHid implements ModInitializer {
	public static final String MOD_ID = "secrets_that_we_hid";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		ModLootTableModifiers.modifyLootTables();
	}
}
