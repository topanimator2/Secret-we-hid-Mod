package net.abit.secrets_that_we_hid.item;

import net.abit.secrets_that_we_hid.SecretsThatWeHid;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tigereye.chestcavity.ChestCavity;

public class ModItems {
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(SecretsThatWeHid.MOD_ID, name), item);
    }

    public static final  Item DEATH_PROTECTION_HEART = registerItem("death_protection_heart",
            new Item(new FabricItemSettings().group(ChestCavity.ORGAN_ITEM_GROUP).maxCount(1)));
    public static final  Item HEART_WARDEN = registerItem("heart_warden",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static void registerModItems() {


        SecretsThatWeHid.LOGGER.debug("Registering Mod Items for " + SecretsThatWeHid.MOD_ID);

    }
}

