package testMod.holders;

import nova.core.render.RenderManager;
import nova.core.render.texture.BlockTexture;
import nova.core.render.texture.Texture;
import testMod.TestMod;

/**
 * Created by AEnterprise
 */
public class Textures {
	public static Texture basicBlock;

	public static void preInit(RenderManager renderManager) {
		basicBlock = renderManager.registerTexture(new BlockTexture(TestMod.modID, "Bottom"));
	}
}
