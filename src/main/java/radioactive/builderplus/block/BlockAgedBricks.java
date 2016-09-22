package radioactive.builderplus.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import radioactive.builderplus.BuilderMod;
import radioactive.builderplus.Info;

public class BlockAgedBricks extends Block
{
	public BlockAgedBricks() {
		super(Material.ROCK);
		
		setUnlocalizedName(Info.BuilderBlocks.AGED_BRICKS.getUnlocalizedname());
		setRegistryName(Info.BuilderBlocks.AGED_BRICKS.getRegistryname());
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}