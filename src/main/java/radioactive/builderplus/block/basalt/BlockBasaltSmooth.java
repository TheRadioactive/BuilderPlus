package radioactive.builderplus.block.basalt;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockBasaltSmooth extends Block
{
	public BlockBasaltSmooth()
	{
		super(Material.ROCK);
		
		String name = "basalt_smooth";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
