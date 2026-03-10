package net.mc.spaceprotocol.procedures;

import net.minecraft.network.chat.Component;

public class AlienShipHorizontalSlabTooltipProcedure {
	public static String execute() {
		return "\u00A7a" + Component.translatable("tooltip.space_protocol.alien_ship_horizontal_slab").getString();
	}
}