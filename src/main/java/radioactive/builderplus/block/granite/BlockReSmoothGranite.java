package radioactive.builderplus.block.granite;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockReSmoothGranite extends Block
{
	public BlockReSmoothGranite()
	{
		super(Material.ROCK);
		
		String name = "re_smooth_granite";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
