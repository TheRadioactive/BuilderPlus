package radioactive.builderplus.block.basalt;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockBasaltBricks extends Block
{
	public BlockBasaltBricks()
	{
		super(Material.ROCK);
		
		String name = "basalt_bricks";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}