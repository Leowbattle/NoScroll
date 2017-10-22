package noscroll;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

//The juice of the mod
//Basically, if you want to see how the mod works, come here

@Mod.EventBusSubscriber
public class KeyEvents {
	public static boolean scrollLockEnabled = false;
	
	@SubscribeEvent
	public static void mouseEvent(MouseEvent e) {
		//Scroll event
		if (e.getDwheel() > 0 && !ModConfig.scrollToSelectIsEnabled && !KeyBinds.scrollLock.isKeyDown() || e.getDwheel() < 0 && !ModConfig.scrollToSelectIsEnabled && !KeyBinds.scrollLock.isKeyDown()) {
			e.setCanceled(true);
		}
	}
	
	@SubscribeEvent
	public static void keyEvent(KeyInputEvent e) {
		if (KeyBinds.scrollUpOne.isPressed()) {
			Minecraft.getMinecraft().player.inventory.changeCurrentItem(1);
		}
		if (KeyBinds.scrollDownOne.isPressed()) {
			Minecraft.getMinecraft().player.inventory.changeCurrentItem(-1);
		}
	}
}
