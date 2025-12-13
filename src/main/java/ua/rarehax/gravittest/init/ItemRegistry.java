package ua.rarehax.gravittest.init;


import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ua.rarehax.gravittest.GravitTest;
import ua.rarehax.gravittest.items.WoodenSword;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GravitTest.MODID);

    public static final RegistryObject<Item> WOODEN_SWORD = ITEMS.register("wooden_sword",
            () -> new WoodenSword(Tiers.WOOD, 3, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> WOOD_SHIT_ITEM = ITEMS.register("wood_shit",
            () -> new BlockItem(BlockRegistry.WOOD_SHIT.get(), new Item.Properties()));

    public static final RegistryObject<Item> WOODEN_GOLEM_SPAWN_EGG = ITEMS.register("wooden_golem_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityRegistry.WOODEN_GOLEM, 0x6b4416, 0x3d260a, new Item.Properties()));
}