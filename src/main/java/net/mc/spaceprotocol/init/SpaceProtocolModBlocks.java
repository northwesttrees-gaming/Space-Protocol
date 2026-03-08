/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mc.spaceprotocol.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mc.spaceprotocol.block.SelvianSolderOreBlock;
import net.mc.spaceprotocol.block.SelvianBlock;
import net.mc.spaceprotocol.SpaceProtocolMod;

import java.util.function.Function;

public class SpaceProtocolModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SpaceProtocolMod.MODID);
	public static final DeferredBlock<Block> SELVIAN;
	public static final DeferredBlock<Block> SELVIAN_SOLDER_ORE;
	static {
		SELVIAN = register("selvian", SelvianBlock::new);
		SELVIAN_SOLDER_ORE = register("selvian_solder_ore", SelvianSolderOreBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}