package ua.rarehax.gravittest.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import ua.rarehax.gravittest.GravitTest;

@Mod.EventBusSubscriber(modid = GravitTest.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeServer(), new RarehaxRecipeProvider(packOutput));
        generator.addProvider(event.includeClient(), new RarehaxBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new RarehaxItemModelProvider(packOutput, existingFileHelper));
    }
}