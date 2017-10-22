package noscroll;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class KeyBinds {
	//This actually could be scroll lock if you want, but the default is control
	public static KeyBinding scrollLock;
	
	public static void initKeyBinds() {
		scrollLock = new KeyBinding("key.scrolllock", Keyboard.KEY_LCONTROL, "key.noscroll.category");
		
		ClientRegistry.registerKeyBinding(scrollLock);
	}
}
