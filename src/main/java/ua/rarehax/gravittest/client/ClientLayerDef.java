package ua.rarehax.gravittest.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import ua.rarehax.gravittest.GravitTest;

public class ClientLayerDef {
    public static final ModelLayerLocation WOODEN_GOLEM_LAYER = new ModelLayerLocation(
            new ResourceLocation(GravitTest.MODID, "wooden_golem"), "main");
}