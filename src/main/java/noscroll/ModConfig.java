package noscroll;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = NoScroll.MODID)
public class ModConfig {
	@Config.Comment("Set to true to disable mouse scrolling to change selected item. Default: true")
	public static boolean scrollToSelectIsEnabled = true;
	
	@Mod.EventBusSubscriber(modid = NoScroll.MODID)
	private static class EventHandler {
		@SubscribeEvent
		public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(NoScroll.MODID)) {
				ConfigManager.sync(NoScroll.MODID, Config.Type.INSTANCE);
			}
		}
	}
}
