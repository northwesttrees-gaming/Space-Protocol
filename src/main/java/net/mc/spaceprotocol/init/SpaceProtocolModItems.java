/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mc.spaceprotocol.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mc.spaceprotocol.block.AlienShipVerticalPanelBlock;
import net.mc.spaceprotocol.block.AlienShipTilesBlock;
import net.mc.spaceprotocol.block.AlienShipHorizontalPanelBlock;
import net.mc.spaceprotocol.block.AlienShipCeilingLightBlock;
import net.mc.spaceprotocol.block.AlienShipBlockBlock;
import net.mc.spaceprotocol.SpaceProtocolMod;

import java.util.function.Function;

public class SpaceProtocolModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SpaceProtocolMod.MODID);
	public static final DeferredItem<Item> ALIEN_SHIP_BLOCK;
	public static final DeferredItem<Item> ALIEN_SHIP_HORIZONTAL_PANEL;
	public static final DeferredItem<Item> ALIEN_SHIP_VERTICAL_PANEL;
	public static final DeferredItem<Item> ALIEN_SHIP_TILES;
	public static final DeferredItem<Item> ALIEN_SHIP_CEILING_LIGHT;
	static {
		ALIEN_SHIP_BLOCK = register("alien_ship_block", AlienShipBlockBlock.Item::new);
		ALIEN_SHIP_HORIZONTAL_PANEL = register("alien_ship_horizontal_panel", AlienShipHorizontalPanelBlock.Item::new);
		ALIEN_SHIP_VERTICAL_PANEL = register("alien_ship_vertical_panel", AlienShipVerticalPanelBlock.Item::new);
		ALIEN_SHIP_TILES = register("alien_ship_tiles", AlienShipTilesBlock.Item::new);
		ALIEN_SHIP_CEILING_LIGHT = register("alien_ship_ceiling_light", AlienShipCeilingLightBlock.Item::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}