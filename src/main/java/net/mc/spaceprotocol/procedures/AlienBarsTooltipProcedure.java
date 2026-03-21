package net.mc.spaceprotocol.procedures;

import net.neoforged.bus.api.Event;

public class AlienBarsTooltipProcedure {
	public static String execute() {
		return "\u00A7a" + Component.translatable("tooltip.space_protocol.alien_bars").getString();
	}
}