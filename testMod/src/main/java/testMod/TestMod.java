package testMod;

import nova.core.block.BlockManager;
import nova.core.loader.Loadable;
import nova.core.loader.NovaMod;
import nova.core.render.RenderManager;
import testMod.holders.Blocks;
import testMod.holders.Textures;

/**
 * Created by AEnterprise
 */

@NovaMod(id=TestMod.modID, name="Test Mod", version = "@MODVERSION@", novaVersion = "0.0.1")
public class TestMod implements Loadable{
	public static final String modID = "testMod";

	public final BlockManager blockManager;
	public final RenderManager renderManager;

	public TestMod(BlockManager blockManager, RenderManager renderManager) {
		this.blockManager = blockManager;
		this.renderManager = renderManager;
	}

	@Override
	public void preInit() {
		Textures.preInit(renderManager);
		Blocks.preInit(blockManager);
	}
}
