
package net.mcreator.mobilephone.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WireItem extends Item {
	public WireItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}