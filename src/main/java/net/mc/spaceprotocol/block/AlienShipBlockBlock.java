package net.mc.spaceprotocol.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AlienShipBlockBlock extends Block {
	public AlienShipBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.DEEPSLATE).sound(SoundType.METAL).strength(-1, 3600000).pushReaction(PushReaction.BLOCK).instrument(NoteBlockInstrument.IRON_XYLOPHONE));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.BLOCKED;
	}
}