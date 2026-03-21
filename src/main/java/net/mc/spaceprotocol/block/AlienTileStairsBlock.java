package net.mc.spaceprotocol.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AlienTileStairsBlock extends StairBlock {
	public AlienTileStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.mapColor(MapColor.DEEPSLATE).sound(SoundType.METAL).strength(-1, 3600000).pushReaction(PushReaction.BLOCK).instrument(NoteBlockInstrument.IRON_XYLOPHONE));
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.BLOCKED;
	}
}