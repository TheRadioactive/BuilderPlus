package radioactive.builderplus.block.andesite;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import radioactive.builderplus.BuilderMod;
import radioactive.builderplus.Info;

public class BlockReAndesite extends Block
{
	public BlockReAndesite() {
		super(Material.ROCK);
		
		String name = "re_andesite";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}