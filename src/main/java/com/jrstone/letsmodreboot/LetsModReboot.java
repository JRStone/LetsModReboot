package com.jrstone.letsmodreboot;

import com.jrstone.letsmodreboot.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION , guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot {

    @Instance(Reference.MOD_ID)
    public static LetsModReboot instance = new LetsModReboot();

    @SidedProxy(clientSide = "com.jrstone.letsmodreboot.ClientProxy", serverSide = "com.jrstone.letsmodreboot.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        this.proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        this.proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        this.proxy.postInit(e);
    }

}
