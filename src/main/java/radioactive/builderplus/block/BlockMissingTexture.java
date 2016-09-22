package radioactive.builderplus.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import radioactive.builderplus.Info;

public class BlockMissingTexture extends Block
{
	public BlockMissingTexture() {
		super(Material.ROCK);
		
		setUnlocalizedName(Info.BuilderBlocks.MISSING_TEXTURE.getUnlocalizedname());
		setRegistryName(Info.BuilderBlocks.MISSING_TEXTURE.getRegistryname());
		
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}