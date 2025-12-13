package ua.rarehax.gravittest.client.renderer;

import net.minecraft.client.model.IronGolemModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import ua.rarehax.gravittest.GravitTest;
import ua.rarehax.gravittest.client.ClientLayerDef;
import ua.rarehax.gravittest.entities.WoodenGolemEntity;

public class WoodenGolemRenderer extends MobRenderer<WoodenGolemEntity, IronGolemModel<WoodenGolemEntity>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(GravitTest.MODID, "textures/entity/wooden_golem.png");

    public WoodenGolemRenderer(EntityRendererProvider.Context context) {
        super(context, new IronGolemModel<>(context.bakeLayer(ClientLayerDef.WOODEN_GOLEM_LAYER)), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(WoodenGolemEntity entity) {
        return TEXTURE;
    }
}