package com.jrstone.letsmodreboot;

import com.jrstone.letsmodreboot.block.ModBlocks;
import com.jrstone.letsmodreboot.crafting.ModCrafting;
import com.jrstone.letsmodreboot.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        ModItems.createItems();
        ModBlocks.createBlocks();
        ModCrafting.createRecipes();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}


