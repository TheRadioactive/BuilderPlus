package radioactive.builderplus.block.marble;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;

public class BlockMarbleCobblestone extends Block
{
	public BlockMarbleCobblestone()
	{
		super(Material.ROCK);
		
		String name = "marble_cobblestone";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
