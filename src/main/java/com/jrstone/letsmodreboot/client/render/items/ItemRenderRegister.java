package com.jrstone.letsmodreboot.client.render.items;

import com.jrstone.letsmodreboot.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister
{
    public static void registerItemRenderer()
    {
        reg(ModItems.mapleLeaf);
    }


    public static void reg(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
    }

}
