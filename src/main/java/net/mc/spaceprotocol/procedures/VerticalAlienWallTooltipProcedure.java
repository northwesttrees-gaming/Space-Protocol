package net.mc.spaceprotocol.procedures;

import net.neoforged.bus.api.Event;

public class VerticalAlienWallTooltipProcedure {
	public static String execute() {
		return "\u00A7a" + Component.translatable("tooltip.space_protocol.vertical_alien_wall").getString();
	}
}