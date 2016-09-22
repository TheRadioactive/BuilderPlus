package radioactive.builderplus.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import radioactive.builderplus.BuilderMod;
import radioactive.builderplus.Info;

public class BlockCotswoldBricks extends Block
{
	public BlockCotswoldBricks() {
		super(Material.ROCK);
		
		setUnlocalizedName(Info.BuilderBlocks.COTSWOLD_BRICKS.getUnlocalizedname());
		setRegistryName(Info.BuilderBlocks.COTSWOLD_BRICKS.getRegistryname());
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}
