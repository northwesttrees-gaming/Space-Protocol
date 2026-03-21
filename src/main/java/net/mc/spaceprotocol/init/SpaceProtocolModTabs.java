/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mc.spaceprotocol.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mc.spaceprotocol.SpaceProtocolMod;

public class SpaceProtocolModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpaceProtocolMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SPACE_PROTOCOL_BLOCKS = REGISTRY.register("space_protocol_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.space_protocol.space_protocol_blocks")).icon(() -> new ItemStack(SpaceProtocolModBlocks.ALIEN_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SpaceProtocolModBlocks.SELVIAN_SOLDER_ORE.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.SELVIAN.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_SHIP_WALL.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_SHIP_HORIZONTAL_SLAB.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_SHIP_TILE_PRESSURE_PLATE.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_SHIP_GLASS.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.HORIZONTAL_ALIEN_STAIRS.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.VERTICAL_ALIEN_STAIRS.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_GRATE_PANE.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.HORIZONTAL_ALIEN_BLOCK.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_TILE_STAIRS.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_TRAPDOOR.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_BUTTON.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_GLASS.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.HORIZONTAL_ALIEN_SLAB.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_WALL_LIGHT.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_BLOCK.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_DOOR.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_TILES.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_PRESSURE_PLATE.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.VERTICAL_ALIEN_BLOCK.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.SMOOTH_ALIEN_BLOCK.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_GLASS_PANE.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_CEILING_LIGHT.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_BARS_PANE.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_STAIRS.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_WALL.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_BARS.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_SLAB.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.HORIZONTAL_ALIEN_WALL.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_TILE_WALL.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_GRATE.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.VERTICAL_ALIEN_SLAB.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_TILE_SLAB.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.VERTICAL_ALIEN_WALL.get().asItem());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SPACE_PROTOCOL_ITEMS = REGISTRY.register("space_protocol_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.space_protocol.space_protocol_items")).icon(() -> new ItemStack(SpaceProtocolModItems.SOLDER_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SpaceProtocolModItems.RAW_SOLDER.get());
				tabData.accept(SpaceProtocolModItems.SOLDER_INGOT.get());
			}).withTabsBefore(SPACE_PROTOCOL_BLOCKS.getId()).build());
}