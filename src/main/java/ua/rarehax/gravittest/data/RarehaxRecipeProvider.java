package ua.rarehax.gravittest.data;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import ua.rarehax.gravittest.init.BlockRegistry;
import ua.rarehax.gravittest.init.ItemRegistry;

import java.util.function.Consumer;

public class RarehaxRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public RarehaxRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ItemRegistry.WOODEN_SWORD.get())
                .pattern("W")
                .pattern("W")
                .pattern("S")
                .define('W', BlockRegistry.WOOD_SHIT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_wood_shit", has(BlockRegistry.WOOD_SHIT.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.WOOD_SHIT.get())
                .requires(Blocks.OAK_PLANKS, 9)
                .unlockedBy("has_planks", has(Blocks.OAK_PLANKS))
                .save(consumer);
    }
}