package radioactive.builderplus.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BuilderModItems
{
	public static void PreInit()
	{
		RegisterItems();
	}

	public static void RegisterItems()
	{
	}

	public static void RegisterRenders() 
	{
	}

	public static void RegisterRender(Item item) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
