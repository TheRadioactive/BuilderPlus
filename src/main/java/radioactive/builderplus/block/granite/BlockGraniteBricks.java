package radioactive.builderplus.block.granite;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockGraniteBricks extends Block
{
	public BlockGraniteBricks()
	{
		super(Material.ROCK);
		
		String name = "granite_bricks";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
