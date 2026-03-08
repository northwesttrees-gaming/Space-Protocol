package net.mc.spaceprotocol.procedures;

import net.neoforged.bus.api.Event;

public class AlienShipCeilingLightTooltipProcedure {
	public static String execute() {
		return "\u00A7a" + Component.translatable("tooltip.space_protocol.alien_ship_ceiling_light").getString();
	}
}