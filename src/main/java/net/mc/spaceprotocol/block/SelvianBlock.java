package net.mc.spaceprotocol.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SelvianBlock extends Block {
	public SelvianBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.TERRACOTTA_CYAN).sound(SoundType.DEEPSLATE).strength(3.5f, 17.5f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}