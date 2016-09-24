package radioactive.builderplus.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import radioactive.builderplus.BuilderMod;
import radioactive.builderplus.block.BlockStone;

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
		CreativeTabs tab = BuilderMod.GetInstance().GetCreativeTab();
		missing = new Block(Material.CIRCUITS).setHardness(.2f).setResistance(10.0f).setUnlocalizedName("missing").setRegistryName("missing").setCreativeTab(tab);
		mixed_bricks = new Block(Material.ROCK).setHardness(2.0f).setResistance(10.0f).setUnlocalizedName("mixed_bricks").setRegistryName("mixed_bricks").setCreativeTab(tab);
		aged_bricks = new Block(Material.ROCK).setHardness(2.0f).setResistance(10.0f).setUnlocalizedName("rusty_bricks").setRegistryName("rusty_bricks").setCreativeTab(tab);
		cotswold_bricks = new Block(Material.ROCK).setHardness(2.0f).setResistance(10.0f).setUnlocalizedName("cotswold_bricks").setRegistryName("cotswold_bricks").setCreativeTab(tab);

		andesite_cobblestone = new Block(Material.ROCK).setHardness(1.7f).setResistance(10.0f).setUnlocalizedName("andesite_cobblestone").setCreativeTab(tab).setRegistryName("andesite_cobblestone");
		andesite = new BlockStone(andesite_cobblestone).setHardness(1.5f).setResistance(10.0f).setUnlocalizedName("re_andesite").setCreativeTab(tab).setRegistryName("re_andesite");
		andesite_bricks = new Block(Material.ROCK).setHardness(1.4f).setResistance(10.0f).setUnlocalizedName("andesite_bricks").setCreativeTab(tab).setRegistryName("andesite_bricks");
		andesite_smooth = new Block(Material.ROCK).setHardness(1.3f).setResistance(10.0f).setUnlocalizedName("re_smooth_andesite").setCreativeTab(tab).setRegistryName("re_smooth_andesite");

		granite_cobblestone = new Block(Material.ROCK).setHardness(1.7f).setResistance(10.0f).setUnlocalizedName("granite_cobblestone").setCreativeTab(tab).setRegistryName("granite_cobblestone");
		granite = new BlockStone(granite_cobblestone).setHardness(1.5f).setResistance(10.0f).setUnlocalizedName("re_granite").setCreativeTab(tab).setRegistryName("re_granite");
		granite_bricks = new Block(Material.ROCK).setHardness(1.4f).setResistance(10.0f).setUnlocalizedName("granite_bricks").setCreativeTab(tab).setRegistryName("granite_bricks");
		granite_smooth = new Block(Material.ROCK).setHardness(1.3f).setResistance(10.0f).setUnlocalizedName("re_smooth_granite").setCreativeTab(tab).setRegistryName("re_smooth_granite");

		diorite_cobblestone = new Block(Material.ROCK).setHardness(1.7f).setResistance(10.0f).setUnlocalizedName("diorite_cobblestone").setCreativeTab(tab).setRegistryName("diorite_cobblestone");
		diorite = new BlockStone(diorite_cobblestone).setHardness(1.5f).setResistance(10.0f).setUnlocalizedName("re_diorite").setCreativeTab(tab).setRegistryName("re_diorite");
		diorite_bricks = new Block(Material.ROCK).setHardness(1.4f).setResistance(10.0f).setUnlocalizedName("diorite_bricks").setCreativeTab(tab).setRegistryName("diorite_bricks");
		diorite_smooth = new Block(Material.ROCK).setHardness(1.3f).setResistance(10.0f).setUnlocalizedName("re_smooth_diorite").setCreativeTab(tab).setRegistryName("re_smooth_diorite");

		sand_cobblestone = new Block(Material.ROCK).setHardness(1.0f).setResistance(7.0f).setUnlocalizedName("sand_cobblestone").setCreativeTab(tab).setRegistryName("sand_cobblestone");
		sand = new BlockStone(sand_cobblestone).setHardness(0.8f).setResistance(7.0f).setUnlocalizedName("re_sandstone").setCreativeTab(tab).setRegistryName("re_sandstone");
		sand_bricks = new Block(Material.ROCK).setHardness(0.7f).setResistance(7.0f).setUnlocalizedName("sandstone_bricks").setCreativeTab(tab).setRegistryName("sandstone_bricks");
		sand_smooth = new Block(Material.ROCK).setHardness(0.7f).setResistance(7.0f).setUnlocalizedName("re_smooth_sandstone").setCreativeTab(tab).setRegistryName("re_smooth_sandstone");

		limestone_cobblestone = new Block(Material.ROCK).setHardness(1.7f).setResistance(10.0f).setUnlocalizedName("limestone_cobblestone").setCreativeTab(tab).setRegistryName("limestone_cobblestone");
		limestone = new BlockStone(limestone_cobblestone).setHardness(1.5f).setResistance(10.0f).setUnlocalizedName("limestone").setCreativeTab(tab).setRegistryName("limestone");
		limestone_bricks = new Block(Material.ROCK).setHardness(1.3f).setResistance(10.0f).setUnlocalizedName("limestone_bricks").setCreativeTab(tab).setRegistryName("limestone_bricks");
		limestone_smooth = new Block(Material.ROCK).setHardness(1.4f).setResistance(10.0f).setUnlocalizedName("limestone_smooth").setCreativeTab(tab).setRegistryName("limestone_smooth");

		marble_cobblestone = new Block(Material.ROCK).setHardness(1.7f).setResistance(10.0f).setUnlocalizedName("marble_cobblestone").setCreativeTab(tab).setRegistryName("marble_cobblestone");
		marble = new BlockStone(marble_cobblestone).setHardness(1.5f).setResistance(10.0f).setUnlocalizedName("marble").setCreativeTab(tab).setRegistryName("marble");
		marble_bricks = new Block(Material.ROCK).setHardness(1.4f).setResistance(10.0f).setUnlocalizedName("marble_bricks").setCreativeTab(tab).setRegistryName("marble_bricks");
		marble_smooth = new Block(Material.ROCK).setHardness(1.3f).setResistance(10.0f).setUnlocalizedName("marble_smooth").setCreativeTab(tab).setRegistryName("marble_smooth");

		basalt_cobblestone = new Block(Material.ROCK).setHardness(1.9f).setResistance(10.0f).setUnlocalizedName("basalt_cobblestone").setCreativeTab(tab).setRegistryName("basalt_cobblestone");
		basalt = new BlockStone(basalt_cobblestone).setHardness(1.7f).setResistance(10.0f).setUnlocalizedName("basalt").setCreativeTab(tab).setRegistryName("basalt");
		basalt_bricks = new Block(Material.ROCK).setHardness(1.6f).setResistance(10.0f).setUnlocalizedName("basalt_bricks").setCreativeTab(tab).setRegistryName("basalt_bricks");
		basalt_smooth = new Block(Material.ROCK).setHardness(1.5f).setResistance(10.0f).setUnlocalizedName("basalt_smooth").setCreativeTab(tab).setRegistryName("basalt_smooth");

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

