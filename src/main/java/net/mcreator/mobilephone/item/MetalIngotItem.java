
package net.mcreator.mobilephone.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MetalIngotItem extends Item {
	public MetalIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
