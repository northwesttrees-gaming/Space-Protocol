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
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}