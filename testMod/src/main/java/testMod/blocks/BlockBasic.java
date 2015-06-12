package testMod.blocks;

import nova.core.block.Block;
import nova.core.block.component.StaticBlockRenderer;
import nova.core.component.Category;
import nova.core.component.misc.Collider;
import nova.core.component.renderer.ItemRenderer;
import testMod.holders.Textures;

/**
 * Created by AEnterprise
 */
public class BlockBasic extends Block {

	public BlockBasic() {
		add(new StaticBlockRenderer(this).setTexture(Textures.basicBlock));
		add(new Collider());
		add(new ItemRenderer(this));
		add(new Category("buildingBlocks"));
		events.on(PlaceEvent.class).bind(this::onPlaced);
	}

	public void onPlaced(PlaceEvent event) {
		System.out.println("Block placed");
	}

	@Override
	public String getID() {
		return "testBlock";
	}
}
