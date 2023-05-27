package ihh.withereggs;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(WitherEggs.MOD_ID)
public class WitherEggs {
    public static final String MOD_ID = "withereggs";

    public WitherEggs() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WitherEggs.MOD_ID);
        Item.Properties properties = new Item.Properties();
        RegistryObject<ForgeSpawnEggItem> illusionerSpawnEgg = ITEMS.register("illusioner_spawn_egg", () -> new ForgeSpawnEggItem(() -> EntityType.ILLUSIONER, 0x959b9b, 0x135993, properties));
        RegistryObject<ForgeSpawnEggItem> giantSpawnEgg = ITEMS.register("giant_spawn_egg", () -> new ForgeSpawnEggItem(() -> EntityType.GIANT, 0x799c65, 0x00afaf, properties));
        ITEMS.register(bus);
        bus.<CreativeModeTabEvent.BuildContents>addListener(e -> {
            if (e.getTab() == CreativeModeTabs.SPAWN_EGGS) {
                e.accept(illusionerSpawnEgg);
                e.accept(giantSpawnEgg);
            }
        });
    }
}
