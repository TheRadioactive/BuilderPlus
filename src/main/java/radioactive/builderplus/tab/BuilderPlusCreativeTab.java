package radioactive.builderplus.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import radioactive.builderplus.Info;
import radioactive.builderplus.init.BuilderModItems;

public class BuilderPlusCreativeTab extends CreativeTabs
{
	public BuilderPlusCreativeTab()
	{
		super(CreativeTabs.getNextID(), Info._creative_tab_name);
	}

	@Override public Item getTabIconItem()
	{
		return BuilderModItems.brick_chisel;
	}
}
