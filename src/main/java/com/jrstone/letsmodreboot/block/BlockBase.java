package com.jrstone.letsmodreboot.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockBase extends Block
{

    public BlockBase(String name)
    {
        this(name, Material.rock);
    }

    public BlockBase(String name, Material material)
    {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), this.getRegistryName());
    }

}
