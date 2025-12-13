package ua.rarehax.gravittest.data;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import ua.rarehax.gravittest.GravitTest;
import ua.rarehax.gravittest.init.BlockRegistry;

public class RarehaxBlockStateProvider extends BlockStateProvider {
    public RarehaxBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, GravitTest.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(BlockRegistry.WOOD_SHIT.get(), cubeAll(BlockRegistry.WOOD_SHIT.get()));
    }
}