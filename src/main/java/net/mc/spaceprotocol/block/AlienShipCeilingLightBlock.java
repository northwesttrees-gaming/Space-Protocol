package net.mc.spaceprotocol.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AlienShipCeilingLightBlock extends Block {
	public AlienShipCeilingLightBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.DEEPSLATE).sound(SoundType.METAL).strength(-1, 3600000).lightLevel(s -> 8).pushReaction(PushReaction.BLOCK).instrument(NoteBlockInstrument.IRON_XYLOPHONE));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.BLOCKED;
	}

	public static class Item extends BlockItem {
		public Item(Item.Properties properties) {
			super(SpaceProtocolModBlocks.ALIEN_SHIP_CEILING_LIGHT.get(), properties);
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			Entity entity = itemstack.getEntityRepresentation() != null ? itemstack.getEntityRepresentation() : SpaceProtocolMod.clientPlayer();
			String hoverText = AlienShipCeilingLightTooltipProcedure.execute();
			if (hoverText != null) {
				for (String line : hoverText.split("\n")) {
					componentConsumer.accept(Component.literal(line));
				}
			}
		}
	}
}