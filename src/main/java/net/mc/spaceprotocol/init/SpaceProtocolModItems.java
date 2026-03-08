/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mc.spaceprotocol.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mc.spaceprotocol.item.SolderIngotItem;
import net.mc.spaceprotocol.item.RawSolderItem;
import net.mc.spaceprotocol.block.*;
import net.mc.spaceprotocol.SpaceProtocolMod;

import java.util.function.Function;

public class SpaceProtocolModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SpaceProtocolMod.MODID);
	public static final DeferredItem<Item> SELVIAN_SOLDER_ORE;
	public static final DeferredItem<Item> SELVIAN;
	public static final DeferredItem<Item> RAW_SOLDER;
	public static final DeferredItem<Item> SOLDER_INGOT;
	public static final DeferredItem<Item> ALIEN_SHIP_BLOCK;
	public static final DeferredItem<Item> ALIEN_SHIP_TILES;
	public static final DeferredItem<Item> ALIEN_SHIP_VERTICAL_PANEL;
	public static final DeferredItem<Item> ALIEN_SHIP_HORIZONTAL_PANEL;
	public static final DeferredItem<Item> ALIEN_SHIP_CEILING_LIGHT;
	public static final DeferredItem<Item> POLISHED_ALIEN_SHIP_BLOCK;
	public static final DeferredItem<Item> ALIEN_SHIP_GRATE;
	public static final DeferredItem<Item> ALIEN_SHIP_BARS;
	public static final DeferredItem<Item> ALIEN_SHIP_WALL_LIGHT;
	public static final DeferredItem<Item> ALIEN_SHIP_DOOR;
	public static final DeferredItem<Item> ALIEN_SHIP_TRAPDOOR;
	static {
		SELVIAN_SOLDER_ORE = block(SpaceProtocolModBlocks.SELVIAN_SOLDER_ORE);
		SELVIAN = block(SpaceProtocolModBlocks.SELVIAN);
		RAW_SOLDER = register("raw_solder", RawSolderItem::new);
		SOLDER_INGOT = register("solder_ingot", SolderIngotItem::new);
		ALIEN_SHIP_BLOCK = register("alien_ship_block", AlienShipBlockBlock.Item::new);
		ALIEN_SHIP_TILES = register("alien_ship_tiles", AlienShipTilesBlock.Item::new);
		ALIEN_SHIP_VERTICAL_PANEL = register("alien_ship_vertical_panel", AlienShipVerticalPanelBlock.Item::new);
		ALIEN_SHIP_HORIZONTAL_PANEL = register("alien_ship_horizontal_panel", AlienShipHorizontalPanelBlock.Item::new);
		ALIEN_SHIP_CEILING_LIGHT = register("alien_ship_ceiling_light", AlienShipCeilingLightBlock.Item::new);
		POLISHED_ALIEN_SHIP_BLOCK = register("polished_alien_ship_block", PolishedAlienShipBlockBlock.Item::new);
		ALIEN_SHIP_GRATE = register("alien_ship_grate", AlienShipGrateBlock.Item::new);
		ALIEN_SHIP_BARS = register("alien_ship_bars", AlienShipBarsBlock.Item::new);
		ALIEN_SHIP_WALL_LIGHT = register("alien_ship_wall_light", AlienShipWallLightBlock.Item::new);
		ALIEN_SHIP_DOOR = register("alien_ship_door", AlienShipDoorBlock.Item::new);
		ALIEN_SHIP_TRAPDOOR = register("alien_ship_trapdoor", AlienShipTrapdoorBlock.Item::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}