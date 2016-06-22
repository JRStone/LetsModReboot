package com.jrstone.letsmodreboot.init;

import com.jrstone.letsmodreboot.item.ItemBase;
//import com.jrstone.letsmodreboot.item.ItemMapleLeaf;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;


/**
 * Created by jimst on 6/21/2016.
 */
public class ModItems
{
    public static ItemBase mapleLeaf;


    public static void init()
    {
        mapleLeaf = register(new ItemBase("Maple Leaf").setCreativeTab(CreativeTabs.tabMaterials));
    }

    private static <T extends Item> T register(T item)
    {
        GameRegistry.register(item);

        if (item instanceof ItemBase)
        {
            ((ItemBase)item).registerItemModel();
        }

        return item;
    }

}


