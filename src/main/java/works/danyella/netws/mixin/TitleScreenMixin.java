/* This code is licensed under MIT License - Danyella Strikann (C) 2024 */
package works.danyella.netws.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import works.danyella.netws.Netws;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
	@Inject(method = "init", at = @At("TAIL"))
	public void onInit(CallbackInfo ci) {
		Netws.LOGGER.info(
				"This line is printed by {}'s TitleScreen Mixin!", Netws.MOD_ID.toUpperCase());
	}
}
