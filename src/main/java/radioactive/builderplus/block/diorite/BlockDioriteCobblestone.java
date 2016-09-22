package radioactive.builderplus.block.diorite;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import radioactive.builderplus.BuilderMod;
import radioactive.builderplus.Info;

public class BlockDioriteCobblestone extends Block
{
	public BlockDioriteCobblestone() {
		super(Material.ROCK);
		
		String name = "diorite_cobblestone";
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
	}
}