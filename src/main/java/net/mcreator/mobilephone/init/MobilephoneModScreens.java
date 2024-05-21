
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mobilephone.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.mobilephone.client.gui.MoneyminecheatmenuScreen;
import net.mcreator.mobilephone.client.gui.MoneymineScreen;
import net.mcreator.mobilephone.client.gui.GitterguiScreen;
import net.mcreator.mobilephone.client.gui.DefaultDesktopScreen;
import net.mcreator.mobilephone.client.gui.CheatmenuScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MobilephoneModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MobilephoneModMenus.DEFAULT_DESKTOP.get(), DefaultDesktopScreen::new);
			MenuScreens.register(MobilephoneModMenus.MONEYMINE.get(), MoneymineScreen::new);
			MenuScreens.register(MobilephoneModMenus.GITTERGUI.get(), GitterguiScreen::new);
			MenuScreens.register(MobilephoneModMenus.CHEATMENU.get(), CheatmenuScreen::new);
			MenuScreens.register(MobilephoneModMenus.MONEYMINECHEATMENU.get(), MoneyminecheatmenuScreen::new);
		});
	}
}
