package testMod.holders;

import nova.core.block.BlockFactory;
import nova.core.block.BlockManager;
import testMod.blocks.BlockBasic;

/**
 * Created by AEnterprise
 */
public class Blocks {
	public static BlockFactory blockTest;

	public static void preInit(BlockManager blockManager) {
		blockTest = blockManager.register(BlockBasic.class);
	}
}
