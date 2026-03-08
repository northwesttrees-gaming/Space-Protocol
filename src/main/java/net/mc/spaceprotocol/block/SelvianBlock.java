package net.mc.spaceprotocol.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class SelvianBlock extends Block {
	public SelvianBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.TERRACOTTA_CYAN).sound(SoundType.DEEPSLATE).strength(3.5f, 17.5f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}