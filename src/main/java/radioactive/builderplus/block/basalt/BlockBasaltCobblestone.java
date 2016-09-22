package radioactive.builderplus.block.basalt;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockBasaltCobblestone extends Block
{
	public BlockBasaltCobblestone()
	{
		super(Material.ROCK);
		
		String name = "basalt_cobblestone";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
