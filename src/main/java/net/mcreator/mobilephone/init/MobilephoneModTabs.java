
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mobilephone.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mobilephone.MobilephoneMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MobilephoneModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MobilephoneMod.MODID);
	public static final RegistryObject<CreativeModeTab> MOBILE_PHONE = REGISTRY.register("mobile_phone",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mobilephone.mobile_phone")).icon(() -> new ItemStack(MobilephoneModItems.MOBILE_PHONE_1.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MobilephoneModItems.MOBILE_PHONE_1.get());
				tabData.accept(MobilephoneModBlocks.METAL_ORE.get().asItem());
				tabData.accept(MobilephoneModItems.PHONECASE.get());
				tabData.accept(MobilephoneModItems.SCREEN.get());
				tabData.accept(MobilephoneModItems.BATTERY.get());
				tabData.accept(MobilephoneModItems.CIRCUIT_BOARD.get());
				tabData.accept(MobilephoneModItems.ANTENNA.get());
				tabData.accept(MobilephoneModItems.WIRE.get());
				tabData.accept(MobilephoneModItems.RUBBER.get());
				tabData.accept(MobilephoneModItems.WIRED_BOARD.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MobilephoneModItems.METAL_INGOT.get());
		}
	}
}
