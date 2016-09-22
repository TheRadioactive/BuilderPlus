package radioactive.builderplus.block.basalt;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockBasalt extends Block
{
	public BlockBasalt()
	{
		super(Material.ROCK);
		
		String name = "basalt";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
