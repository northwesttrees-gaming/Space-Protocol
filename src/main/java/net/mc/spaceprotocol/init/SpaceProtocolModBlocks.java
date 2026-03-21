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
	public static final DeferredBlock<Block> ALIEN_SHIP_WALL;
	public static final DeferredBlock<Block> ALIEN_SHIP_TILE_PRESSURE_PLATE;
	public static final DeferredBlock<Block> ALIEN_SHIP_HORIZONTAL_SLAB;
	public static final DeferredBlock<Block> ALIEN_SHIP_GLASS;
	public static final DeferredBlock<Block> HORIZONTAL_ALIEN_STAIRS;
	public static final DeferredBlock<Block> VERTICAL_ALIEN_STAIRS;
	public static final DeferredBlock<Block> ALIEN_GRATE_PANE;
	public static final DeferredBlock<Block> HORIZONTAL_ALIEN_BLOCK;
	public static final DeferredBlock<Block> ALIEN_TILE_STAIRS;
	public static final DeferredBlock<Block> ALIEN_TRAPDOOR;
	public static final DeferredBlock<Block> ALIEN_BUTTON;
	public static final DeferredBlock<Block> ALIEN_GLASS;
	public static final DeferredBlock<Block> HORIZONTAL_ALIEN_SLAB;
	public static final DeferredBlock<Block> ALIEN_WALL_LIGHT;
	public static final DeferredBlock<Block> ALIEN_BLOCK;
	public static final DeferredBlock<Block> ALIEN_DOOR;
	public static final DeferredBlock<Block> ALIEN_TILES;
	public static final DeferredBlock<Block> ALIEN_PRESSURE_PLATE;
	public static final DeferredBlock<Block> VERTICAL_ALIEN_BLOCK;
	public static final DeferredBlock<Block> SMOOTH_ALIEN_BLOCK;
	public static final DeferredBlock<Block> ALIEN_GLASS_PANE;
	public static final DeferredBlock<Block> ALIEN_CEILING_LIGHT;
	public static final DeferredBlock<Block> ALIEN_BARS_PANE;
	public static final DeferredBlock<Block> ALIEN_STAIRS;
	public static final DeferredBlock<Block> ALIEN_WALL;
	public static final DeferredBlock<Block> ALIEN_BARS;
	public static final DeferredBlock<Block> ALIEN_SLAB;
	public static final DeferredBlock<Block> HORIZONTAL_ALIEN_WALL;
	public static final DeferredBlock<Block> ALIEN_TILE_WALL;
	public static final DeferredBlock<Block> ALIEN_GRATE;
	public static final DeferredBlock<Block> VERTICAL_ALIEN_SLAB;
	public static final DeferredBlock<Block> ALIEN_TILE_SLAB;
	public static final DeferredBlock<Block> VERTICAL_ALIEN_WALL;
	static {
		SELVIAN_SOLDER_ORE = register("selvian_solder_ore", SelvianSolderOreBlock::new);
		SELVIAN = register("selvian", SelvianBlock::new);
		ALIEN_SHIP_WALL = register("alien_ship_wall", AlienShipWallBlock::new);
		ALIEN_SHIP_TILE_PRESSURE_PLATE = register("alien_ship_tile_pressure_plate", AlienShipTilePressurePlateBlock::new);
		ALIEN_SHIP_HORIZONTAL_SLAB = register("alien_ship_horizontal_slab", AlienShipHorizontalSlabBlock::new);
		ALIEN_SHIP_GLASS = register("alien_ship_glass", AlienShipGlassBlock::new);
		HORIZONTAL_ALIEN_STAIRS = register("horizontal_alien_stairs", HorizontalAlienStairsBlock::new);
		VERTICAL_ALIEN_STAIRS = register("vertical_alien_stairs", VerticalAlienStairsBlock::new);
		ALIEN_GRATE_PANE = register("alien_grate_pane", AlienGratePaneBlock::new);
		HORIZONTAL_ALIEN_BLOCK = register("horizontal_alien_block", HorizontalAlienBlockBlock::new);
		ALIEN_TILE_STAIRS = register("alien_tile_stairs", AlienTileStairsBlock::new);
		ALIEN_TRAPDOOR = register("alien_trapdoor", AlienTrapdoorBlock::new);
		ALIEN_BUTTON = register("alien_button", AlienButtonBlock::new);
		ALIEN_GLASS = register("alien_glass", AlienGlassBlock::new);
		HORIZONTAL_ALIEN_SLAB = register("horizontal_alien_slab", HorizontalAlienSlabBlock::new);
		ALIEN_WALL_LIGHT = register("alien_wall_light", AlienWallLightBlock::new);
		ALIEN_BLOCK = register("alien_block", AlienBlockBlock::new);
		ALIEN_DOOR = register("alien_door", AlienDoorBlock::new);
		ALIEN_TILES = register("alien_tiles", AlienTilesBlock::new);
		ALIEN_PRESSURE_PLATE = register("alien_pressure_plate", AlienPressurePlateBlock::new);
		VERTICAL_ALIEN_BLOCK = register("vertical_alien_block", VerticalAlienBlockBlock::new);
		SMOOTH_ALIEN_BLOCK = register("smooth_alien_block", SmoothAlienBlockBlock::new);
		ALIEN_GLASS_PANE = register("alien_glass_pane", AlienGlassPaneBlock::new);
		ALIEN_CEILING_LIGHT = register("alien_ceiling_light", AlienCeilingLightBlock::new);
		ALIEN_BARS_PANE = register("alien_bars_pane", AlienBarsPaneBlock::new);
		ALIEN_STAIRS = register("alien_stairs", AlienStairsBlock::new);
		ALIEN_WALL = register("alien_wall", AlienWallBlock::new);
		ALIEN_BARS = register("alien_bars", AlienBarsBlock::new);
		ALIEN_SLAB = register("alien_slab", AlienSlabBlock::new);
		HORIZONTAL_ALIEN_WALL = register("horizontal_alien_wall", HorizontalAlienWallBlock::new);
		ALIEN_TILE_WALL = register("alien_tile_wall", AlienTileWallBlock::new);
		ALIEN_GRATE = register("alien_grate", AlienGrateBlock::new);
		VERTICAL_ALIEN_SLAB = register("vertical_alien_slab", VerticalAlienSlabBlock::new);
		ALIEN_TILE_SLAB = register("alien_tile_slab", AlienTileSlabBlock::new);
		VERTICAL_ALIEN_WALL = register("vertical_alien_wall", VerticalAlienWallBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}