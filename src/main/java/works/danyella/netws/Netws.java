/* This code is licensed under MIT License - Danyella Strikann (C) 2024 */
package works.danyella.netws;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import works.danyella.netws.items.NetwsItems;

public class Netws implements ModInitializer {
	public static final String MOD_ID = "netws";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ItemGroup NETWS_GROUP =
			Registry.register(
					Registries.ITEM_GROUP,
					new Identifier(MOD_ID, "netws_group"),
					FabricItemGroup.builder()
							.icon(() -> new ItemStack(NetwsItems.CHRONIUM_CRISTAL))
							.name(Text.translatable("itemgroup.netws_group"))
							.entries(
									(displayParams, entries) -> {
										entries.addItem(NetwsItems.CHRONIUM_CRISTAL);
										entries.addItem(NetwsItems.SPATIALITE_CRISTAL);
									})
							.build());

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Initializing {}!", MOD_ID);

		NetwsItems.register();

		Registries.ITEM_GROUP
				.getKey(NETWS_GROUP)
				.ifPresent(key -> LOGGER.info("Registered item group {}", key.getValue()));
	}
}
