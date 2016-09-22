package radioactive.builderplus.block.andesite;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import radioactive.builderplus.BuilderMod;
import radioactive.builderplus.Info;

public class BlockAndesiteCobblestone extends Block
{
	public BlockAndesiteCobblestone() {
		super(Material.ROCK);
		
		String name = "andesite_cobblestone";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}