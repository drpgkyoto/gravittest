package ua.rarehax.gravittest.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ua.rarehax.gravittest.GravitTest;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GravitTest.MODID);

    public static final RegistryObject<Block> WOOD_SHIT = BLOCKS.register("wood_shit",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .mapColor(MapColor.WOOD)
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()));
}