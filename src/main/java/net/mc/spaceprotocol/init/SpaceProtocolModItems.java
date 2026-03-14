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
	public static final DeferredItem<Item> ALIEN_BARS;
	public static final DeferredItem<Item> ALIEN_BARS_PANE;
	public static final DeferredItem<Item> ALIEN_BLOCK;
	public static final DeferredItem<Item> ALIEN_BUTTON;
	public static final DeferredItem<Item> ALIEN_PRESSURE_PLATE;
	public static final DeferredItem<Item> ALIEN_SLAB;
	public static final DeferredItem<Item> ALIEN_STAIRS;
	public static final DeferredItem<Item> ALIEN_WALL;
	public static final DeferredItem<Item> ALIEN_DOOR;
	public static final DeferredItem<Item> ALIEN_GLASS;
	public static final DeferredItem<Item> ALIEN_GLASS_PANE;
	public static final DeferredItem<Item> ALIEN_GRATE;
	public static final DeferredItem<Item> ALIEN_GRATE_PANE;
	public static final DeferredItem<Item> HORIZONTAL_ALIEN_BLOCK;
	public static final DeferredItem<Item> HORIZONTAL_ALIEN_SLAB;
	public static final DeferredItem<Item> HORIZONTAL_ALIEN_STAIRS;
	public static final DeferredItem<Item> HORIZONTAL_ALIEN_WALL;
	public static final DeferredItem<Item> ALIEN_CEILING_LIGHT;
	public static final DeferredItem<Item> ALIEN_WALL_LIGHT;
	public static final DeferredItem<Item> SMOOTH_ALIEN_BLOCK;
	public static final DeferredItem<Item> ALIEN_TILES;
	public static final DeferredItem<Item> ALIEN_TILE_SLAB;
	public static final DeferredItem<Item> ALIEN_TILE_STAIRS;
	public static final DeferredItem<Item> ALIEN_TILE_WALL;
	public static final DeferredItem<Item> ALIEN_TRAPDOOR;
	public static final DeferredItem<Item> VERTICAL_ALIEN_BLOCK;
	public static final DeferredItem<Item> VERTICAL_ALIEN_SLAB;
	public static final DeferredItem<Item> VERTICAL_ALIEN_STAIRS;
	public static final DeferredItem<Item> VERTICAL_ALIEN_WALL;
	static {
		SELVIAN_SOLDER_ORE = block(SpaceProtocolModBlocks.SELVIAN_SOLDER_ORE);
		SELVIAN = block(SpaceProtocolModBlocks.SELVIAN);
		RAW_SOLDER = register("raw_solder", RawSolderItem::new);
		SOLDER_INGOT = register("solder_ingot", SolderIngotItem::new);
		ALIEN_BARS = register("alien_bars", AlienBarsBlock.Item::new);
		ALIEN_BARS_PANE = register("alien_bars_pane", AlienBarsPaneBlock.Item::new);
		ALIEN_BLOCK = register("alien_block", AlienBlockBlock.Item::new);
		ALIEN_BUTTON = register("alien_button", AlienButtonBlock.Item::new);
		ALIEN_PRESSURE_PLATE = register("alien_pressure_plate", AlienPressurePlateBlock.Item::new);
		ALIEN_SLAB = register("alien_slab", AlienSlabBlock.Item::new);
		ALIEN_STAIRS = register("alien_stairs", AlienStairsBlock.Item::new);
		ALIEN_WALL = register("alien_wall", AlienWallBlock.Item::new);
		ALIEN_DOOR = register("alien_door", AlienDoorBlock.Item::new);
		ALIEN_GLASS = register("alien_glass", AlienGlassBlock.Item::new);
		ALIEN_GLASS_PANE = register("alien_glass_pane", AlienGlassPaneBlock.Item::new);
		ALIEN_GRATE = register("alien_grate", AlienGrateBlock.Item::new);
		ALIEN_GRATE_PANE = register("alien_grate_pane", AlienGratePaneBlock.Item::new);
		HORIZONTAL_ALIEN_BLOCK = register("horizontal_alien_block", HorizontalAlienBlockBlock.Item::new);
		HORIZONTAL_ALIEN_SLAB = register("horizontal_alien_slab", HorizontalAlienSlabBlock.Item::new);
		HORIZONTAL_ALIEN_STAIRS = register("horizontal_alien_stairs", HorizontalAlienStairsBlock.Item::new);
		HORIZONTAL_ALIEN_WALL = register("horizontal_alien_wall", HorizontalAlienWallBlock.Item::new);
		ALIEN_CEILING_LIGHT = register("alien_ceiling_light", AlienCeilingLightBlock.Item::new);
		ALIEN_WALL_LIGHT = register("alien_wall_light", AlienWallLightBlock.Item::new);
		SMOOTH_ALIEN_BLOCK = register("smooth_alien_block", SmoothAlienBlockBlock.Item::new);
		ALIEN_TILES = register("alien_tiles", AlienTilesBlock.Item::new);
		ALIEN_TILE_SLAB = register("alien_tile_slab", AlienTileSlabBlock.Item::new);
		ALIEN_TILE_STAIRS = register("alien_tile_stairs", AlienTileStairsBlock.Item::new);
		ALIEN_TILE_WALL = register("alien_tile_wall", AlienTileWallBlock.Item::new);
		ALIEN_TRAPDOOR = register("alien_trapdoor", AlienTrapdoorBlock.Item::new);
		VERTICAL_ALIEN_BLOCK = register("vertical_alien_block", VerticalAlienBlockBlock.Item::new);
		VERTICAL_ALIEN_SLAB = register("vertical_alien_slab", VerticalAlienSlabBlock.Item::new);
		VERTICAL_ALIEN_STAIRS = register("vertical_alien_stairs", VerticalAlienStairsBlock.Item::new);
		VERTICAL_ALIEN_WALL = register("vertical_alien_wall", VerticalAlienWallBlock.Item::new);
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