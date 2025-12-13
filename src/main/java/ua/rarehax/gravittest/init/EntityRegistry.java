package ua.rarehax.gravittest.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ua.rarehax.gravittest.GravitTest;
import ua.rarehax.gravittest.entities.WoodenGolemEntity;

public class EntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GravitTest.MODID);

    public static final RegistryObject<EntityType<WoodenGolemEntity>> WOODEN_GOLEM = ENTITIES.register("wooden_golem",
            () -> EntityType.Builder.of(WoodenGolemEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 2.0f)
                    .build(new ResourceLocation(GravitTest.MODID, "wooden_golem").toString()));
}