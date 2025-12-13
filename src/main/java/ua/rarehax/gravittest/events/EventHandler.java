package ua.rarehax.gravittest.events;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import ua.rarehax.gravittest.GravitTest;
import ua.rarehax.gravittest.entities.WoodenGolemEntity;
import ua.rarehax.gravittest.init.EntityRegistry;

@Mod.EventBusSubscriber(modid = GravitTest.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventHandler {
    @SubscribeEvent
    public static void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
        event.put(EntityRegistry.WOODEN_GOLEM.get(), WoodenGolemEntity.createAttributes().build());
    }
}