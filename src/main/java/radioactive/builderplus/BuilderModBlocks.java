package radioactive.builderplus;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import radioactive.builderplus.block.BlockAgedBricks;
import radioactive.builderplus.block.BlockMissingTexture;
import radioactive.builderplus.block.BlockMixedBricks;

public class BuilderModBlocks
{
	public static Block mixed_bricks, aged_bricks, missing;
	
	public static void PreInit()
	{
		mixed_bricks = new BlockMixedBricks();
		aged_bricks = new BlockAgedBricks();
		missing = new BlockMissingTexture();
		RegisterBlocks();
	}

	public static void RegisterBlocks() 
	{
		RegisterBlock(mixed_bricks);
		RegisterBlock(aged_bricks);
		RegisterBlock(missing);
	}
	
	private static void RegisterBlock(Block block)
	{
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}

	public static void RegisterRenders() 
	{
		RegisterRender(mixed_bricks);
		RegisterRender(aged_bricks);
		RegisterRender(missing);
	}

	public static void RegisterRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
