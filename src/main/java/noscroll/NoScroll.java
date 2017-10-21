package noscroll;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import noscroll.proxies.ClientProxy;

@Mod(modid = NoScroll.MODID, name = NoScroll.NAME, version = NoScroll.VERSION, acceptedMinecraftVersions = NoScroll.ACCEPTEDMINECRAFTVERSIONS)
public class NoScroll {
	public static final String MODID = "noscroll";
	public static final String NAME = "No Scroll";
	public static final String VERSION = "1.0";
	public static final String ACCEPTEDMINECRAFTVERSIONS = "[1.12, 1.12.1]";
	
	@SidedProxy(serverSide = "noscroll.proxies.ServerProxy", clientSide = "noscroll.proxies.ClientProxy")
	public static ClientProxy proxy;
	
	@Mod.Instance(MODID)
	public static NoScroll instance;
	
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new KeyEvents());
	}
	
	@Mod.EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.init();
	}
	
	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}
