package com.jrstone.letsmodreboot.client.render.blocks;

import com.jrstone.letsmodreboot.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister
{
    public static void registerBlockRenderer() {
        reg(ModBlocks.flag);
    }

    public static void reg(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

}
