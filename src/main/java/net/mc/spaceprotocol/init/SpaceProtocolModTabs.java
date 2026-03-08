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
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.space_protocol.space_protocol_blocks")).icon(() -> new ItemStack(SpaceProtocolModBlocks.ALIEN_SHIP_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SpaceProtocolModBlocks.ALIEN_SHIP_BLOCK.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_SHIP_CEILING_LIGHT.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_SHIP_HORIZONTAL_PANEL.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_SHIP_VERTICAL_PANEL.get().asItem());
				tabData.accept(SpaceProtocolModBlocks.ALIEN_SHIP_TILES.get().asItem());
			}).build());
}