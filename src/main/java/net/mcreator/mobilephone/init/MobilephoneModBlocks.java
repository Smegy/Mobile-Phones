
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mobilephone.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mobilephone.block.MetalOreBlock;
import net.mcreator.mobilephone.MobilephoneMod;

public class MobilephoneModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MobilephoneMod.MODID);
	public static final RegistryObject<Block> METAL_ORE = REGISTRY.register("metal_ore", () -> new MetalOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
