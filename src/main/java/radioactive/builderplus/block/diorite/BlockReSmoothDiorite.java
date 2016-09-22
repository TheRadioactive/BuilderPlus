package radioactive.builderplus.block.diorite;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import radioactive.builderplus.BuilderMod;
import radioactive.builderplus.Info;

public class BlockReSmoothDiorite extends Block
{
	public BlockReSmoothDiorite() {
		super(Material.ROCK);
		
		String name = "re_smooth_diorite";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}