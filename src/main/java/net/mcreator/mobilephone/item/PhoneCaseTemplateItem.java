
package net.mcreator.mobilephone.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PhoneCaseTemplateItem extends Item {
	public PhoneCaseTemplateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
