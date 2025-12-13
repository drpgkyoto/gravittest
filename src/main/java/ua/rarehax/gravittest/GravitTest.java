package ua.rarehax.gravittest;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import ua.rarehax.gravittest.init.BlockRegistry;
import ua.rarehax.gravittest.init.CreativeTabRegistry;
import ua.rarehax.gravittest.init.EntityRegistry;
import ua.rarehax.gravittest.init.ItemRegistry;

@Mod(GravitTest.MODID)
public class GravitTest {
    public static final String MODID = "gravittest";

    public GravitTest() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegistry.ITEMS.register(modEventBus);
        BlockRegistry.BLOCKS.register(modEventBus);
        EntityRegistry.ENTITIES.register(modEventBus);
        CreativeTabRegistry.TABS.register(modEventBus);
    }
}