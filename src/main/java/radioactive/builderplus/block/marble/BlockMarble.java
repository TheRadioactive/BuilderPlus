package radioactive.builderplus.block.marble;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockMarble extends Block
{
	public BlockMarble()
	{
		super(Material.ROCK);
		
		String name = "marble";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
