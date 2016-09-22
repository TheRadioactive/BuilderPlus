package radioactive.builderplus.block.limestone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockLimestoneCobblestone extends Block
{
	public BlockLimestoneCobblestone()
	{
		super(Material.ROCK);
		
		String name = "limestone_cobblestone";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
