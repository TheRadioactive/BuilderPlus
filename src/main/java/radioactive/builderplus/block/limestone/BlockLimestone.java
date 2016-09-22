package radioactive.builderplus.block.limestone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockLimestone extends Block
{
	public BlockLimestone()
	{
		super(Material.ROCK);
		
		String name = "limestone";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
