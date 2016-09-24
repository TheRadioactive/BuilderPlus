package radioactive.builderplus.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import radioactive.builderplus.BuilderMod;
import radioactive.builderplus.item.ItemBrickChisel;

public class BuilderModItems
{
	public static Item brick_chisel, steel_ingot;

	public static void PreInit()
	{
		brick_chisel = new ItemBrickChisel().setUnlocalizedName("brick_chisel").setRegistryName("brick_chisel").setCreativeTab(BuilderMod.GetInstance().GetCreativeTab());
		steel_ingot = new Item().setUnlocalizedName("steel_ingot").setRegistryName("steel_ingot").setCreativeTab(CreativeTabs.MATERIALS);

		RegisterItems();
	}

	public static void RegisterItems()
	{
		GameRegistry.register(brick_chisel);
		GameRegistry.register(steel_ingot);
	}

	public static void RegisterRenders() 
	{
		RegisterRender(brick_chisel);
		RegisterRender(steel_ingot);
	}

	public static void RegisterRender(Item item) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
