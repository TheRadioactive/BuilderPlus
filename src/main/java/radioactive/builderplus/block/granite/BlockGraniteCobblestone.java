package radioactive.builderplus.block.granite;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockGraniteCobblestone extends Block
{
	public BlockGraniteCobblestone()
	{
		super(Material.ROCK);
		
		String name = "granite_cobblestone";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}

