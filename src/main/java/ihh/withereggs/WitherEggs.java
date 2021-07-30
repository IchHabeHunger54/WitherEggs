package ihh.withereggs;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("withereggs")
public class WitherEggs {
    public WitherEggs() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "withereggs");
    static {
        ITEMS.register("wither_spawn_egg", () -> new SpawnEggItem(EntityType.WITHER, 0x1f1f1f, 0x6b8a8a, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        ITEMS.register("ender_dragon_spawn_egg", () -> new SpawnEggItem(EntityType.ENDER_DRAGON, 0x0e0e0e, 0xcc00fa, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        ITEMS.register("iron_golem_spawn_egg", () -> new SpawnEggItem(EntityType.IRON_GOLEM, 0xe2dbd6, 0x74a332, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        ITEMS.register("snow_golem_spawn_egg", () -> new SpawnEggItem(EntityType.SNOW_GOLEM, 0xffffff, 0xe38a1d, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        ITEMS.register("illusioner_spawn_egg", () -> new SpawnEggItem(EntityType.ILLUSIONER, 0x959b9b, 0x135993, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        ITEMS.register("giant_spawn_egg", () -> new SpawnEggItem(EntityType.GIANT, 0x799c65, 0x00afaf, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    }
}
