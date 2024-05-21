
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mobilephone.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mobilephone.item.WiredBoardItem;
import net.mcreator.mobilephone.item.WireItem;
import net.mcreator.mobilephone.item.ScreenItem;
import net.mcreator.mobilephone.item.RubberItem;
import net.mcreator.mobilephone.item.PhonecaseItem;
import net.mcreator.mobilephone.item.PhoneCaseTemplateItem;
import net.mcreator.mobilephone.item.MobilePhone1Item;
import net.mcreator.mobilephone.item.MetalIngotItem;
import net.mcreator.mobilephone.item.CircuitBoardItem;
import net.mcreator.mobilephone.item.BatteryItem;
import net.mcreator.mobilephone.item.AntennaItem;
import net.mcreator.mobilephone.MobilephoneMod;

public class MobilephoneModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MobilephoneMod.MODID);
	public static final RegistryObject<Item> MOBILE_PHONE_1 = REGISTRY.register("mobile_phone_1", () -> new MobilePhone1Item());
	public static final RegistryObject<Item> METAL_INGOT = REGISTRY.register("metal_ingot", () -> new MetalIngotItem());
	public static final RegistryObject<Item> METAL_ORE = block(MobilephoneModBlocks.METAL_ORE);
	public static final RegistryObject<Item> PHONECASE = REGISTRY.register("phonecase", () -> new PhonecaseItem());
	public static final RegistryObject<Item> SCREEN = REGISTRY.register("screen", () -> new ScreenItem());
	public static final RegistryObject<Item> BATTERY = REGISTRY.register("battery", () -> new BatteryItem());
	public static final RegistryObject<Item> CIRCUIT_BOARD = REGISTRY.register("circuit_board", () -> new CircuitBoardItem());
	public static final RegistryObject<Item> ANTENNA = REGISTRY.register("antenna", () -> new AntennaItem());
	public static final RegistryObject<Item> PHONE_CASE_TEMPLATE = REGISTRY.register("phone_case_template", () -> new PhoneCaseTemplateItem());
	public static final RegistryObject<Item> WIRE = REGISTRY.register("wire", () -> new WireItem());
	public static final RegistryObject<Item> RUBBER = REGISTRY.register("rubber", () -> new RubberItem());
	public static final RegistryObject<Item> WIRED_BOARD = REGISTRY.register("wired_board", () -> new WiredBoardItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
