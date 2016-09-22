package radioactive.builderplus.block.limestone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockLimestoneBricks extends Block
{
	public BlockLimestoneBricks()
	{
		super(Material.ROCK);
		
		String name = "limestone_bricks";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
