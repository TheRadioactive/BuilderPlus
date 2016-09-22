package radioactive.builderplus.block.sandstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockReSmoothSandstone extends Block
{
	public BlockReSmoothSandstone()
	{
		super(Material.ROCK);
		
		String name = "re_smooth_sandstone";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
