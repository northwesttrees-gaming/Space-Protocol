package net.mc.spaceprotocol.procedures;

import net.minecraft.network.chat.Component;

public class AlienWallLightTooltipProcedure {
	public static String execute() {
		return "\u00A7a" + Component.translatable("tooltip.space_protocol.alien_wall_light").getString();
	}
}