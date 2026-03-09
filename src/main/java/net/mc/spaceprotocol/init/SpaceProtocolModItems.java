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
	public static final DeferredItem<Item> ALIEN_SHIP_BARS_PANE;
	public static final DeferredItem<Item> ALIEN_SHIP_GRATE_PANE;
	public static final DeferredItem<Item> ALIEN_SHIP_STAIRS;
	public static final DeferredItem<Item> ALIEN_SHIP_SLAB;
	public static final DeferredItem<Item> ALIEN_SHIP_WALL;
	public static final DeferredItem<Item> ALIEN_SHIP_BUTTON;
	public static final DeferredItem<Item> ALIEN_SHIP_PRESSURE_PLATE;
	public static final DeferredItem<Item> ALIEN_SHIP_TILE_STAIRS;
	public static final DeferredItem<Item> ALIEN_SHIP_TILE_SLAB;
	public static final DeferredItem<Item> ALIEN_SHIP_TILE_WALL;
	public static final DeferredItem<Item> ALIEN_SHIP_TILE_PRESSURE_PLATE;
	public static final DeferredItem<Item> ALIEN_SHIP_TILE_BUTTON;
	public static final DeferredItem<Item> ALIEN_SHIP_HORIZONTAL_STAIRS;
	public static final DeferredItem<Item> ALIEN_SHIP_HORIZONTAL_SLAB;
	public static final DeferredItem<Item> ALIEN_SHIP_HORIZONTAL_WALL;
	public static final DeferredItem<Item> ALIEN_SHIP_HORIZONTAL_PRESSURE_PLATE;
	public static final DeferredItem<Item> ALIEN_SHIP_HORIZONTAL_BUTTON;
	public static final DeferredItem<Item> ALIEN_SHIP_VERTICAL_STAIRS;
	public static final DeferredItem<Item> ALIEN_SHIP_VERTICAL_SLAB;
	public static final DeferredItem<Item> ALIEN_SHIP_VERTICAL_WALL;
	public static final DeferredItem<Item> ALIEN_SHIP_VERTICAL_PRESSURE_PLATE;
	public static final DeferredItem<Item> ALIEN_SHIP_VERTICAL_BUTTON;
	public static final DeferredItem<Item> ALIEN_SHIP_GLASS;
	public static final DeferredItem<Item> ALIEN_SHIP_GLASS_PANE;
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
		ALIEN_SHIP_BARS_PANE = register("alien_ship_bars_pane", AlienShipBarsPaneBlock.Item::new);
		ALIEN_SHIP_GRATE_PANE = register("alien_ship_grate_pane", AlienShipGratePaneBlock.Item::new);
		ALIEN_SHIP_STAIRS = register("alien_ship_stairs", AlienShipStairsBlock.Item::new);
		ALIEN_SHIP_SLAB = register("alien_ship_slab", AlienShipSlabBlock.Item::new);
		ALIEN_SHIP_WALL = register("alien_ship_wall", AlienShipWallBlock.Item::new);
		ALIEN_SHIP_BUTTON = register("alien_ship_button", AlienShipButtonBlock.Item::new);
		ALIEN_SHIP_PRESSURE_PLATE = register("alien_ship_pressure_plate", AlienShipPressurePlateBlock.Item::new);
		ALIEN_SHIP_TILE_STAIRS = register("alien_ship_tile_stairs", AlienShipTileStairsBlock.Item::new);
		ALIEN_SHIP_TILE_SLAB = register("alien_ship_tile_slab", AlienShipTileSlabBlock.Item::new);
		ALIEN_SHIP_TILE_WALL = register("alien_ship_tile_wall", AlienShipTileWallBlock.Item::new);
		ALIEN_SHIP_TILE_PRESSURE_PLATE = register("alien_ship_tile_pressure_plate", AlienShipTilePressurePlateBlock.Item::new);
		ALIEN_SHIP_TILE_BUTTON = register("alien_ship_tile_button", AlienShipTileButtonBlock.Item::new);
		ALIEN_SHIP_HORIZONTAL_STAIRS = register("alien_ship_horizontal_stairs", AlienShipHorizontalStairsBlock.Item::new);
		ALIEN_SHIP_HORIZONTAL_SLAB = register("alien_ship_horizontal_slab", AlienShipHorizontalSlabBlock.Item::new);
		ALIEN_SHIP_HORIZONTAL_WALL = register("alien_ship_horizontal_wall", AlienShipHorizontalWallBlock.Item::new);
		ALIEN_SHIP_HORIZONTAL_PRESSURE_PLATE = register("alien_ship_horizontal_pressure_plate", AlienShipHorizontalPressurePlateBlock.Item::new);
		ALIEN_SHIP_HORIZONTAL_BUTTON = register("alien_ship_horizontal_button", AlienShipHorizontalButtonBlock.Item::new);
		ALIEN_SHIP_VERTICAL_STAIRS = register("alien_ship_vertical_stairs", AlienShipVerticalStairsBlock.Item::new);
		ALIEN_SHIP_VERTICAL_SLAB = register("alien_ship_vertical_slab", AlienShipVerticalSlabBlock.Item::new);
		ALIEN_SHIP_VERTICAL_WALL = register("alien_ship_vertical_wall", AlienShipVerticalWallBlock.Item::new);
		ALIEN_SHIP_VERTICAL_PRESSURE_PLATE = register("alien_ship_vertical_pressure_plate", AlienShipVerticalPressurePlateBlock.Item::new);
		ALIEN_SHIP_VERTICAL_BUTTON = register("alien_ship_vertical_button", AlienShipVerticalButtonBlock.Item::new);
		ALIEN_SHIP_GLASS = register("alien_ship_glass", AlienShipGlassBlock.Item::new);
		ALIEN_SHIP_GLASS_PANE = register("alien_ship_glass_pane", AlienShipGlassPaneBlock.Item::new);
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