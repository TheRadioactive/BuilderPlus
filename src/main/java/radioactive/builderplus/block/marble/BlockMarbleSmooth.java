package radioactive.builderplus.block.marble;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockMarbleSmooth extends Block
{
	public BlockMarbleSmooth()
	{
		super(Material.ROCK);
		
		String name = "marble_smooth";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
