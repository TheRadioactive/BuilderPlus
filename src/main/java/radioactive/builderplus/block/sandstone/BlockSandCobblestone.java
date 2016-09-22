package radioactive.builderplus.block.sandstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockSandCobblestone extends Block
{
	public BlockSandCobblestone()
	{
		super(Material.ROCK);
		
		String name = "sand_cobblestone";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
