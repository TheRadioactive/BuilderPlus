package radioactive.builderplus;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import radioactive.builderplus.block.BlockAgedBricks;
import radioactive.builderplus.block.BlockCotswoldBricks;
import radioactive.builderplus.block.BlockMissingTexture;
import radioactive.builderplus.block.BlockMixedBricks;
import radioactive.builderplus.block.andesite.BlockAndesiteBricks;
import radioactive.builderplus.block.andesite.BlockAndesiteCobblestone;
import radioactive.builderplus.block.andesite.BlockReAndesite;
import radioactive.builderplus.block.andesite.BlockReSmoothAndesite;
import radioactive.builderplus.block.basalt.BlockBasalt;
import radioactive.builderplus.block.basalt.BlockBasaltBricks;
import radioactive.builderplus.block.basalt.BlockBasaltCobblestone;
import radioactive.builderplus.block.basalt.BlockBasaltSmooth;
import radioactive.builderplus.block.diorite.BlockDioriteBricks;
import radioactive.builderplus.block.diorite.BlockDioriteCobblestone;
import radioactive.builderplus.block.diorite.BlockReDiorite;
import radioactive.builderplus.block.diorite.BlockReSmoothDiorite;
import radioactive.builderplus.block.granite.BlockGraniteBricks;
import radioactive.builderplus.block.granite.BlockGraniteCobblestone;
import radioactive.builderplus.block.granite.BlockReGranite;
import radioactive.builderplus.block.granite.BlockReSmoothGranite;
import radioactive.builderplus.block.limestone.BlockLimestone;
import radioactive.builderplus.block.limestone.BlockLimestoneBricks;
import radioactive.builderplus.block.limestone.BlockLimestoneCobblestone;
import radioactive.builderplus.block.limestone.BlockLimestoneSmooth;
import radioactive.builderplus.block.marble.BlockMarble;
import radioactive.builderplus.block.marble.BlockMarbleBricks;
import radioactive.builderplus.block.marble.BlockMarbleCobblestone;
import radioactive.builderplus.block.marble.BlockMarbleSmooth;
import radioactive.builderplus.block.sandstone.BlockReSandstone;
import radioactive.builderplus.block.sandstone.BlockReSmoothSandstone;
import radioactive.builderplus.block.sandstone.BlockSandCobblestone;
import radioactive.builderplus.block.sandstone.BlockSandstoneBricks;

public class BuilderModBlocks
{
	public static Block mixed_bricks, aged_bricks, cotswold_bricks, missing;
	
	public static Block andesite, andesite_bricks, andesite_cobblestone, andesite_smooth;
	public static Block granite, granite_bricks, granite_cobblestone, granite_smooth;
	public static Block diorite, diorite_bricks, diorite_cobblestone, diorite_smooth;
	public static Block sand, sand_bricks, sand_cobblestone, sand_smooth;
	
	public static Block limestone, limestone_bricks, limestone_cobblestone, limestone_smooth;
	public static Block marble, marble_bricks, marble_cobblestone, marble_smooth;
	public static Block basalt, basalt_bricks, basalt_cobblestone, basalt_smooth;
	
	public static void PreInit()
	{
		missing = new BlockMissingTexture();
		mixed_bricks = new BlockMixedBricks();
		aged_bricks = new BlockAgedBricks();
		cotswold_bricks = new BlockCotswoldBricks();
		
		andesite = new BlockReAndesite();
		andesite_cobblestone = new BlockAndesiteCobblestone();
		andesite_bricks = new BlockAndesiteBricks();
		andesite_smooth = new BlockReSmoothAndesite();
		
		granite = new BlockReGranite();
		granite_cobblestone = new BlockGraniteCobblestone();
		granite_bricks = new BlockGraniteBricks();
		granite_smooth = new BlockReSmoothGranite();
		
		diorite = new BlockReDiorite();
		diorite_cobblestone = new BlockDioriteCobblestone();
		diorite_bricks = new BlockDioriteBricks();
		diorite_smooth = new BlockReSmoothDiorite();

		sand = new BlockReSandstone();
		sand_cobblestone = new BlockSandCobblestone();
		sand_bricks = new BlockSandstoneBricks();
		sand_smooth = new BlockReSmoothSandstone();
		
		limestone = new BlockLimestone();
		limestone_cobblestone = new BlockLimestoneCobblestone();
		limestone_bricks = new BlockLimestoneBricks();
		limestone_smooth = new BlockLimestoneSmooth();
		
		marble = new BlockMarble();
		marble_cobblestone = new BlockMarbleCobblestone();
		marble_bricks = new BlockMarbleBricks();
		marble_smooth = new BlockMarbleSmooth();
		
		basalt = new BlockBasalt();
		basalt_cobblestone = new BlockBasaltCobblestone();
		basalt_bricks = new BlockBasaltBricks();
		basalt_smooth = new BlockBasaltSmooth();
		
		RegisterBlocks();
	}

	public static void RegisterBlocks() 
	{
		RegisterBlock(missing);
		RegisterBlock(mixed_bricks);
		RegisterBlock(aged_bricks);
		RegisterBlock(cotswold_bricks);
		RegisterBlock(andesite);
		RegisterBlock(andesite_cobblestone);
		RegisterBlock(andesite_bricks);
		RegisterBlock(andesite_smooth);
		RegisterBlock(granite);
		RegisterBlock(granite_cobblestone);
		RegisterBlock(granite_bricks);
		RegisterBlock(granite_smooth);
		RegisterBlock(diorite);
		RegisterBlock(diorite_cobblestone);
		RegisterBlock(diorite_bricks);
		RegisterBlock(diorite_smooth);
		RegisterBlock(sand);
		RegisterBlock(sand_cobblestone);
		RegisterBlock(sand_bricks);
		RegisterBlock(sand_smooth);
		RegisterBlock(limestone);
		RegisterBlock(limestone_cobblestone);
		RegisterBlock(limestone_bricks);
		RegisterBlock(limestone_smooth);
		RegisterBlock(marble);
		RegisterBlock(marble_cobblestone);
		RegisterBlock(marble_bricks);
		RegisterBlock(marble_smooth);
		RegisterBlock(basalt);
		RegisterBlock(basalt_cobblestone);
		RegisterBlock(basalt_bricks);
		RegisterBlock(basalt_smooth);
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
		RegisterRender(missing);
		RegisterRender(mixed_bricks);
		RegisterRender(aged_bricks);
		RegisterRender(cotswold_bricks);
		RegisterRender(andesite);
		RegisterRender(andesite_cobblestone);
		RegisterRender(andesite_bricks);
		RegisterRender(andesite_smooth);
		RegisterRender(granite);
		RegisterRender(granite_cobblestone);
		RegisterRender(granite_bricks);
		RegisterRender(granite_smooth);
		RegisterRender(diorite);
		RegisterRender(diorite_cobblestone);
		RegisterRender(diorite_bricks);
		RegisterRender(diorite_smooth);
		RegisterRender(sand);
		RegisterRender(sand_cobblestone);
		RegisterRender(sand_bricks);
		RegisterRender(sand_smooth);
		RegisterRender(limestone);
		RegisterRender(limestone_cobblestone);
		RegisterRender(limestone_bricks);
		RegisterRender(limestone_smooth);
		RegisterRender(marble);
		RegisterRender(marble_cobblestone);
		RegisterRender(marble_bricks);
		RegisterRender(marble_smooth);
		RegisterRender(basalt);
		RegisterRender(basalt_cobblestone);
		RegisterRender(basalt_bricks);
		RegisterRender(basalt_smooth);
	}

	public static void RegisterRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
