
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mobilephone.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.mobilephone.world.inventory.MoneyminecheatmenuMenu;
import net.mcreator.mobilephone.world.inventory.MoneymineMenu;
import net.mcreator.mobilephone.world.inventory.GitterguiMenu;
import net.mcreator.mobilephone.world.inventory.DefaultDesktopMenu;
import net.mcreator.mobilephone.world.inventory.CheatmenuMenu;
import net.mcreator.mobilephone.MobilephoneMod;

public class MobilephoneModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MobilephoneMod.MODID);
	public static final RegistryObject<MenuType<DefaultDesktopMenu>> DEFAULT_DESKTOP = REGISTRY.register("default_desktop", () -> IForgeMenuType.create(DefaultDesktopMenu::new));
	public static final RegistryObject<MenuType<MoneymineMenu>> MONEYMINE = REGISTRY.register("moneymine", () -> IForgeMenuType.create(MoneymineMenu::new));
	public static final RegistryObject<MenuType<GitterguiMenu>> GITTERGUI = REGISTRY.register("gittergui", () -> IForgeMenuType.create(GitterguiMenu::new));
	public static final RegistryObject<MenuType<CheatmenuMenu>> CHEATMENU = REGISTRY.register("cheatmenu", () -> IForgeMenuType.create(CheatmenuMenu::new));
	public static final RegistryObject<MenuType<MoneyminecheatmenuMenu>> MONEYMINECHEATMENU = REGISTRY.register("moneyminecheatmenu", () -> IForgeMenuType.create(MoneyminecheatmenuMenu::new));
}
