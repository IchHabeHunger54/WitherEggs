package ihh.withereggs;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(WitherEggs.MOD_ID)
public class WitherEggs {
    public static final String MOD_ID = "withereggs";

    public WitherEggs() {
        DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WitherEggs.MOD_ID);
        ITEMS.register("wither_spawn_egg", () -> new ForgeSpawnEggItem(() -> EntityType.WITHER, 0x1f1f1f, 0x6b8a8a, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        ITEMS.register("ender_dragon_spawn_egg", () -> new ForgeSpawnEggItem(() -> EntityType.ENDER_DRAGON, 0x0e0e0e, 0xcc00fa, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        ITEMS.register("iron_golem_spawn_egg", () -> new ForgeSpawnEggItem(() -> EntityType.IRON_GOLEM, 0xe2dbd6, 0x74a332, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        ITEMS.register("snow_golem_spawn_egg", () -> new ForgeSpawnEggItem(() -> EntityType.SNOW_GOLEM, 0xffffff, 0xe38a1d, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        ITEMS.register("illusioner_spawn_egg", () -> new ForgeSpawnEggItem(() -> EntityType.ILLUSIONER, 0x959b9b, 0x135993, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        ITEMS.register("giant_spawn_egg", () -> new ForgeSpawnEggItem(() -> EntityType.GIANT, 0x799c65, 0x00afaf, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
