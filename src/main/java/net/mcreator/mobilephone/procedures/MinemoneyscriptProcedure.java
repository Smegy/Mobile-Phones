package net.mcreator.mobilephone.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mobilephone.network.MobilephoneModVariables;

public class MinemoneyscriptProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(MobilephoneModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MobilephoneModVariables.PlayerVariables())).moneymined + 1;
			entity.getCapability(MobilephoneModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.moneymined = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
