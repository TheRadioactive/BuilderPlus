package radioactive.builderplus.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import radioactive.builderplus.BuilderMod;
import radioactive.builderplus.Info;

public class BlockMixedBricks extends Block
{
	public BlockMixedBricks() {
		super(Material.ROCK);
		
		setUnlocalizedName(Info.BuilderBlocks.MIXED_BRICKS.getUnlocalizedname());
		setRegistryName(Info.BuilderBlocks.MIXED_BRICKS.getRegistryname());
		
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}