/* This code is licensed under MIT License - Danyella Strikann (C) 2024 */
package works.danyella.netws.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import works.danyella.netws.Netws;

public class NetwsItems {
	public static final Item CHRONIUM_CRISTAL =
			registerItem(
					"chronium_crystal",
					new Item(new QuiltItemSettings().fireproof().rarity(Rarity.EPIC)));
	public static final Item SPATIALITE_CRISTAL =
			registerItem(
					"spatialite_crystal",
					new Item(new QuiltItemSettings().fireproof().rarity(Rarity.EPIC)));

	public static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(Netws.MOD_ID, name), item);
	}

	public static void register() {
		Netws.LOGGER.info("Registering items for {}...", Netws.MOD_ID.toUpperCase());

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
				.register(
						entries -> {
							entries.addItem(NetwsItems.CHRONIUM_CRISTAL);
						});
	}
}
