package radioactive.builderplus.block.sandstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockSandstoneBricks extends Block
{
	public BlockSandstoneBricks()
	{
		super(Material.ROCK);
		
		String name = "sandstone_bricks";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
