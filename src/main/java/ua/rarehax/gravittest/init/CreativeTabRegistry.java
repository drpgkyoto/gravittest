package ua.rarehax.gravittest.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import ua.rarehax.gravittest.GravitTest;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GravitTest.MODID);

    public static final RegistryObject<CreativeModeTab> GRAVIT_TAB = TABS.register("gravit_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.literal("Итемы для гравита"))
                    .icon(() -> ItemRegistry.WOODEN_SWORD.get().getDefaultInstance())
                    .displayItems((params, output) -> {
                        output.accept(ItemRegistry.WOOD_SHIT_ITEM.get());
                        output.accept(ItemRegistry.WOODEN_SWORD.get());
                        output.accept(ItemRegistry.WOODEN_GOLEM_SPAWN_EGG.get());
                    })
                    .build());
}