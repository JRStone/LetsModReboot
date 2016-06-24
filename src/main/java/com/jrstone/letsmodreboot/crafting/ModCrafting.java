package com.jrstone.letsmodreboot.crafting;

import com.jrstone.letsmodreboot.block.ModBlocks;
import com.jrstone.letsmodreboot.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void createRecipes() {
        // Shaped Recipes  parms are out and in
        GameRegistry.addRecipe(new ItemStack(ModBlocks.flag), new Object[]{"##", "##", '#', ModItems.mapleLeaf});
        GameRegistry.addRecipe(new ItemStack(Items.diamond),new Object[]{" # ", "# #"," # ", '#', ModItems.mapleLeaf});
        GameRegistry.addRecipe(new ItemStack(Items.diamond),new Object[]{" # ", "# #"," # ", '#', Blocks.dirt});
        GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf),new Object[]{"###", "###", '#', Blocks.dirt});
        GameRegistry.addRecipe(new ItemStack(Items.shears), new Object[]{" #", "# ", '#', ModItems.mapleLeaf});

        // Shapeless Recipes parms are out and in
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks ,8), new Object[] {Blocks.dirt, new ItemStack(ModItems.mapleLeaf)});

        //Smelting Recipes parms are in and out
        GameRegistry.addSmelting(Items.coal, new ItemStack(Items.diamond,3), 1.0F);
    }
}
