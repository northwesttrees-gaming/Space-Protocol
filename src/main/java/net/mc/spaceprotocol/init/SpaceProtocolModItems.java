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
import net.mc.spaceprotocol.SpaceProtocolMod;

import java.util.function.Function;

public class SpaceProtocolModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SpaceProtocolMod.MODID);
	public static final DeferredItem<Item> SELVIAN;
	public static final DeferredItem<Item> SELVIAN_SOLDER_ORE;
	public static final DeferredItem<Item> RAW_SOLDER;
	public static final DeferredItem<Item> SOLDER_INGOT;
	static {
		SELVIAN = block(SpaceProtocolModBlocks.SELVIAN);
		SELVIAN_SOLDER_ORE = block(SpaceProtocolModBlocks.SELVIAN_SOLDER_ORE);
		RAW_SOLDER = register("raw_solder", RawSolderItem::new);
		SOLDER_INGOT = register("solder_ingot", SolderIngotItem::new);
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