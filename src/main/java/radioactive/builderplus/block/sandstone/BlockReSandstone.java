package radioactive.builderplus.block.sandstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockReSandstone extends Block
{
	public BlockReSandstone()
	{
		super(Material.ROCK);
		
		String name = "re_sandstone";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
