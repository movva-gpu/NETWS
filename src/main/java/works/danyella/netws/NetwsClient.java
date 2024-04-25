/* This code is licensed under MIT License - Danyella Strikann (C) 2024 */
package works.danyella.netws;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public class NetwsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient(ModContainer mod) {
		Netws.LOGGER.info("It's {} from the Minecraft client!", Netws.MOD_ID.toUpperCase());
	}
}
