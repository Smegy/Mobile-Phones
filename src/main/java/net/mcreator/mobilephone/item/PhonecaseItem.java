
package net.mcreator.mobilephone.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PhonecaseItem extends Item {
	public PhonecaseItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
