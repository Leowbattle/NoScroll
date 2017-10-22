package noscroll;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class KeyBinds {
	//This actually could be scroll lock if you want, but the default is backslash
	public static KeyBinding scrollLock = new KeyBinding("key.scrolllock", Keyboard.KEY_BACKSLASH, "key.noscroll.category");;
	
	public static KeyBinding scrollUpOne = new KeyBinding("key.scrollupone", Keyboard.KEY_MINUS, "key.noscroll.category");
	public static KeyBinding scrollDownOne = new KeyBinding("key.scrolldownone", Keyboard.KEY_EQUALS, "key.noscroll.category");
	
	public static void initKeyBinds() {
		ClientRegistry.registerKeyBinding(scrollLock);
		ClientRegistry.registerKeyBinding(scrollUpOne);
		ClientRegistry.registerKeyBinding(scrollDownOne);
	}
}
