
package net.mcreator.mobilephone.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ScreenItem extends Item {
	public ScreenItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
