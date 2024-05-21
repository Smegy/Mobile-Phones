package net.mcreator.mobilephone.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mobilephone.network.MobilephoneModVariables;

public class SetmoneymineboolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(MobilephoneModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.hasmoneymine = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
