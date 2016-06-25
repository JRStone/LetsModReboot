package com.jrstone.letsmodreboot;

import com.jrstone.letsmodreboot.client.render.blocks.BlockRenderRegister;
import com.jrstone.letsmodreboot.client.render.items.ItemRenderRegister;
import com.jrstone.letsmodreboot.handler.ConfigurationHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{

    @Override
    public void preInit(FMLPreInitializationEvent e)
    {
        super.preInit(e);
        ConfigurationHandler.init(e.getSuggestedConfigurationFile());
        MinecraftForge.EVENT_BUS.register(new ConfigurationHandler());
    }

    @Override
    public void init(FMLInitializationEvent e)
    {
        super.init(e);
        ItemRenderRegister.registerItemRenderer();
        BlockRenderRegister.registerBlockRenderer();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e)
    {
        super.postInit(e);
    }
}
