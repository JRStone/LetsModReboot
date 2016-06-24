package com.jrstone.letsmodreboot.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBase extends Item {

    public ItemBase(String name)
    {
        super();                                                    // The Registry Name will be MOD_ID:name
        setRegistryName(name);                                      // The unique name (within your mod) that identifies this item
        setUnlocalizedName(name);                                   // Used for localization (en_US.lang)
        setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.register(this);
    }
}