package ua.rarehax.gravittest.events;

import net.minecraft.client.model.IronGolemModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import ua.rarehax.gravittest.GravitTest;
import ua.rarehax.gravittest.client.ClientLayerDef;
import ua.rarehax.gravittest.client.renderer.WoodenGolemRenderer;
import ua.rarehax.gravittest.init.EntityRegistry;

@Mod.EventBusSubscriber(modid = GravitTest.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventHandler {
    @SubscribeEvent
    public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityRegistry.WOODEN_GOLEM.get(), WoodenGolemRenderer::new);
    }

    @SubscribeEvent
    public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ClientLayerDef.WOODEN_GOLEM_LAYER, IronGolemModel::createBodyLayer);
    }
}