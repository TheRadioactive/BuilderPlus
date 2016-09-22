package radioactive.builderplus.block.diorite;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import radioactive.builderplus.BuilderMod;
import radioactive.builderplus.Info;

public class BlockDioriteBricks extends Block
{
	public BlockDioriteBricks() {
		super(Material.ROCK);
		
		String name = "diorite_bricks";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}