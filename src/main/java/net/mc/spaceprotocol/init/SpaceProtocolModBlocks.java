/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mc.spaceprotocol.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mc.spaceprotocol.block.*;
import net.mc.spaceprotocol.SpaceProtocolMod;

import java.util.function.Function;

public class SpaceProtocolModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SpaceProtocolMod.MODID);
	public static final DeferredBlock<Block> SELVIAN_SOLDER_ORE;
	public static final DeferredBlock<Block> SELVIAN;
	public static final DeferredBlock<Block> ALIEN_SHIP_BLOCK;
	public static final DeferredBlock<Block> ALIEN_SHIP_TILES;
	public static final DeferredBlock<Block> ALIEN_SHIP_VERTICAL_PANEL;
	public static final DeferredBlock<Block> ALIEN_SHIP_HORIZONTAL_PANEL;
	public static final DeferredBlock<Block> ALIEN_SHIP_CEILING_LIGHT;
	public static final DeferredBlock<Block> POLISHED_ALIEN_SHIP_BLOCK;
	public static final DeferredBlock<Block> ALIEN_SHIP_GRATE;
	public static final DeferredBlock<Block> ALIEN_SHIP_BARS;
	public static final DeferredBlock<Block> ALIEN_SHIP_WALL_LIGHT;
	public static final DeferredBlock<Block> ALIEN_SHIP_DOOR;
	public static final DeferredBlock<Block> ALIEN_SHIP_TRAPDOOR;
	public static final DeferredBlock<Block> ALIEN_SHIP_BARS_PANE;
	public static final DeferredBlock<Block> ALIEN_SHIP_GRATE_PANE;
	public static final DeferredBlock<Block> ALIEN_SHIP_STAIRS;
	public static final DeferredBlock<Block> ALIEN_SHIP_SLAB;
	public static final DeferredBlock<Block> ALIEN_SHIP_WALL;
	public static final DeferredBlock<Block> ALIEN_SHIP_BUTTON;
	public static final DeferredBlock<Block> ALIEN_SHIP_PRESSURE_PLATE;
	public static final DeferredBlock<Block> ALIEN_SHIP_TILE_STAIRS;
	public static final DeferredBlock<Block> ALIEN_SHIP_TILE_SLAB;
	public static final DeferredBlock<Block> ALIEN_SHIP_TILE_WALL;
	public static final DeferredBlock<Block> ALIEN_SHIP_TILE_PRESSURE_PLATE;
	public static final DeferredBlock<Block> ALIEN_SHIP_TILE_BUTTON;
	public static final DeferredBlock<Block> ALIEN_SHIP_HORIZONTAL_STAIRS;
	public static final DeferredBlock<Block> ALIEN_SHIP_HORIZONTAL_SLAB;
	public static final DeferredBlock<Block> ALIEN_SHIP_HORIZONTAL_WALL;
	public static final DeferredBlock<Block> ALIEN_SHIP_HORIZONTAL_PRESSURE_PLATE;
	public static final DeferredBlock<Block> ALIEN_SHIP_HORIZONTAL_BUTTON;
	public static final DeferredBlock<Block> ALIEN_SHIP_VERTICAL_STAIRS;
	public static final DeferredBlock<Block> ALIEN_SHIP_VERTICAL_SLAB;
	public static final DeferredBlock<Block> ALIEN_SHIP_VERTICAL_WALL;
	public static final DeferredBlock<Block> ALIEN_SHIP_VERTICAL_PRESSURE_PLATE;
	public static final DeferredBlock<Block> ALIEN_SHIP_VERTICAL_BUTTON;
	public static final DeferredBlock<Block> ALIEN_SHIP_GLASS;
	public static final DeferredBlock<Block> ALIEN_SHIP_GLASS_PANE;
	static {
		SELVIAN_SOLDER_ORE = register("selvian_solder_ore", SelvianSolderOreBlock::new);
		SELVIAN = register("selvian", SelvianBlock::new);
		ALIEN_SHIP_BLOCK = register("alien_ship_block", AlienShipBlockBlock::new);
		ALIEN_SHIP_TILES = register("alien_ship_tiles", AlienShipTilesBlock::new);
		ALIEN_SHIP_VERTICAL_PANEL = register("alien_ship_vertical_panel", AlienShipVerticalPanelBlock::new);
		ALIEN_SHIP_HORIZONTAL_PANEL = register("alien_ship_horizontal_panel", AlienShipHorizontalPanelBlock::new);
		ALIEN_SHIP_CEILING_LIGHT = register("alien_ship_ceiling_light", AlienShipCeilingLightBlock::new);
		POLISHED_ALIEN_SHIP_BLOCK = register("polished_alien_ship_block", PolishedAlienShipBlockBlock::new);
		ALIEN_SHIP_GRATE = register("alien_ship_grate", AlienShipGrateBlock::new);
		ALIEN_SHIP_BARS = register("alien_ship_bars", AlienShipBarsBlock::new);
		ALIEN_SHIP_WALL_LIGHT = register("alien_ship_wall_light", AlienShipWallLightBlock::new);
		ALIEN_SHIP_DOOR = register("alien_ship_door", AlienShipDoorBlock::new);
		ALIEN_SHIP_TRAPDOOR = register("alien_ship_trapdoor", AlienShipTrapdoorBlock::new);
		ALIEN_SHIP_BARS_PANE = register("alien_ship_bars_pane", AlienShipBarsPaneBlock::new);
		ALIEN_SHIP_GRATE_PANE = register("alien_ship_grate_pane", AlienShipGratePaneBlock::new);
		ALIEN_SHIP_STAIRS = register("alien_ship_stairs", AlienShipStairsBlock::new);
		ALIEN_SHIP_SLAB = register("alien_ship_slab", AlienShipSlabBlock::new);
		ALIEN_SHIP_WALL = register("alien_ship_wall", AlienShipWallBlock::new);
		ALIEN_SHIP_BUTTON = register("alien_ship_button", AlienShipButtonBlock::new);
		ALIEN_SHIP_PRESSURE_PLATE = register("alien_ship_pressure_plate", AlienShipPressurePlateBlock::new);
		ALIEN_SHIP_TILE_STAIRS = register("alien_ship_tile_stairs", AlienShipTileStairsBlock::new);
		ALIEN_SHIP_TILE_SLAB = register("alien_ship_tile_slab", AlienShipTileSlabBlock::new);
		ALIEN_SHIP_TILE_WALL = register("alien_ship_tile_wall", AlienShipTileWallBlock::new);
		ALIEN_SHIP_TILE_PRESSURE_PLATE = register("alien_ship_tile_pressure_plate", AlienShipTilePressurePlateBlock::new);
		ALIEN_SHIP_TILE_BUTTON = register("alien_ship_tile_button", AlienShipTileButtonBlock::new);
		ALIEN_SHIP_HORIZONTAL_STAIRS = register("alien_ship_horizontal_stairs", AlienShipHorizontalStairsBlock::new);
		ALIEN_SHIP_HORIZONTAL_SLAB = register("alien_ship_horizontal_slab", AlienShipHorizontalSlabBlock::new);
		ALIEN_SHIP_HORIZONTAL_WALL = register("alien_ship_horizontal_wall", AlienShipHorizontalWallBlock::new);
		ALIEN_SHIP_HORIZONTAL_PRESSURE_PLATE = register("alien_ship_horizontal_pressure_plate", AlienShipHorizontalPressurePlateBlock::new);
		ALIEN_SHIP_HORIZONTAL_BUTTON = register("alien_ship_horizontal_button", AlienShipHorizontalButtonBlock::new);
		ALIEN_SHIP_VERTICAL_STAIRS = register("alien_ship_vertical_stairs", AlienShipVerticalStairsBlock::new);
		ALIEN_SHIP_VERTICAL_SLAB = register("alien_ship_vertical_slab", AlienShipVerticalSlabBlock::new);
		ALIEN_SHIP_VERTICAL_WALL = register("alien_ship_vertical_wall", AlienShipVerticalWallBlock::new);
		ALIEN_SHIP_VERTICAL_PRESSURE_PLATE = register("alien_ship_vertical_pressure_plate", AlienShipVerticalPressurePlateBlock::new);
		ALIEN_SHIP_VERTICAL_BUTTON = register("alien_ship_vertical_button", AlienShipVerticalButtonBlock::new);
		ALIEN_SHIP_GLASS = register("alien_ship_glass", AlienShipGlassBlock::new);
		ALIEN_SHIP_GLASS_PANE = register("alien_ship_glass_pane", AlienShipGlassPaneBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}