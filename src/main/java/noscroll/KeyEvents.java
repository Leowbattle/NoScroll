package noscroll;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class KeyEvents {
	@SubscribeEvent
	public static void mouseEvent(MouseEvent e) {
		//Scroll event
		if (e.getDwheel() > 0 && !ModConfig.scrollToSelectIsEnabled || e.getDwheel() < 0 && !ModConfig.scrollToSelectIsEnabled) {
			e.setCanceled(true);
		}
	}
}
