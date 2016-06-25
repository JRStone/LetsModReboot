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
           //  This example uses an array to define the input.
        GameRegistry.addRecipe(new ItemStack(ModBlocks.flag), new Object[]{"##", "##", '#', ModItems.mapleLeaf});
           //  This example does not use an array for the input.  An array is not required and this is simpler.
        GameRegistry.addRecipe(new ItemStack(Items.diamond), " # ", "# #"," # ", '#', ModItems.mapleLeaf);
           //  This example includes an output quantity when defining the recipe result.
        GameRegistry.addRecipe(new ItemStack(Items.diamond, 4 )," # ", "# #"," # ", '#', Blocks.dirt);
           //  This example shows how to use multiple tokens to require multiple recipe inputs.
        GameRegistry.addRecipe(new ItemStack(Items.diamond, 4 ),"s#", "s#", '#', Blocks.dirt,'s', Blocks.sand);


        // Shapeless Recipes parms are out and in
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks ,8), Blocks.dirt, ModItems.mapleLeaf);
          // This recipe uses an ItemStack to define one of its inputs. Items.dye with a metadata of 4 is Lapis Lazuli.
          // The '1' in the itemstack definition says that only one lapis is needed.
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks ,7), Blocks.dirt, new ItemStack(Items.dye,1,4));
          //  This recipe says that 4 dirt will yield 8 wood planks
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks ,3), Blocks.dirt, Blocks.dirt, Blocks.dirt, Blocks.dirt);
          //  Yow would think that creating an itemstack wit a quantity of 4 would do the same thing, but it does not.
          //  The quantity is ignored and assumed to be 1.
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks ,5), new ItemStack(Blocks.sand,4));

        //Smelting Recipes parms are in and out
        GameRegistry.addSmelting(Items.coal, new ItemStack(Items.diamond,3), 1.0F);
    }
}
