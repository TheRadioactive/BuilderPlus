package radioactive.builderplus.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import radioactive.builderplus.BuilderModBlocks;
import radioactive.builderplus.Info;

public class BuilderPlusCreativeTab extends CreativeTabs
{
	public BuilderPlusCreativeTab()
	{
		super(CreativeTabs.getNextID(), Info._creative_tab_name);
	}

	@Override public Item getTabIconItem()
	{
		return Item.getItemFromBlock(BuilderModBlocks.mixed_bricks);
	}
}
