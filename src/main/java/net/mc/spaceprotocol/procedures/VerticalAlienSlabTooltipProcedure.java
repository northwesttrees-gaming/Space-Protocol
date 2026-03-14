package net.mc.spaceprotocol.procedures;

import net.minecraft.network.chat.Component;

public class VerticalAlienSlabTooltipProcedure {
	public static String execute() {
		return "\u00A7a" + Component.translatable("tooltip.space_protocol.vertical_alien_slab").getString();
	}
}