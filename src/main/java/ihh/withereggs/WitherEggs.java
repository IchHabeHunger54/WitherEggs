package ihh.withereggs;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(WitherEggs.MOD_ID)
public class WitherEggs {
    public static final String MOD_ID = "withereggs";

    public WitherEggs(IEventBus bus) {
        DeferredRegister.Items ITEMS = DeferredRegister.createItems(WitherEggs.MOD_ID);
        Item.Properties properties = new Item.Properties();
        DeferredItem<DeferredSpawnEggItem> illusionerSpawnEgg = ITEMS.register("illusioner_spawn_egg", () -> new DeferredSpawnEggItem(() -> EntityType.ILLUSIONER, 0x959b9b, 0x135993, properties));
        DeferredItem<DeferredSpawnEggItem> giantSpawnEgg = ITEMS.register("giant_spawn_egg", () -> new DeferredSpawnEggItem(() -> EntityType.GIANT, 0x799c65, 0x00afaf, properties));
        ITEMS.register(bus);
        bus.<BuildCreativeModeTabContentsEvent>addListener(e -> {
            if (e.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
                e.accept(illusionerSpawnEgg);
                e.accept(giantSpawnEgg);
            }
        });
    }
}
