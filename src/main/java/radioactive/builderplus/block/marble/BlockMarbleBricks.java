package radioactive.builderplus.block.marble;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockMarbleBricks extends Block
{
	public BlockMarbleBricks()
	{
		super(Material.ROCK);
		
		String name = "marble_bricks";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
