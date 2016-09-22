package radioactive.builderplus.block.limestone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockLimestoneSmooth extends Block
{
	public BlockLimestoneSmooth()
	{
		super(Material.ROCK);
		
		String name = "limestone_smooth";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
