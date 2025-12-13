package ua.rarehax.gravittest.data;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import ua.rarehax.gravittest.GravitTest;
import ua.rarehax.gravittest.init.ItemRegistry;

public class RarehaxItemModelProvider extends ItemModelProvider {
    public RarehaxItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GravitTest.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(ItemRegistry.WOODEN_SWORD.getId().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(GravitTest.MODID, "item/wooden_sword"));

        withExistingParent(ItemRegistry.WOODEN_GOLEM_SPAWN_EGG.getId().getPath(), new ResourceLocation("item/template_spawn_egg"));
    }
}