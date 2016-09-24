package radioactive.builderplus.init;

import radioactive.builderplus.BuilderMod;
import radioactive.builderplus.init.BuilderModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BuilderModCrafting
{
	public static void Register()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.mixed_bricks, 1), Blocks.BRICK_BLOCK);
		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.aged_bricks, 1), BuilderModBlocks.mixed_bricks);
		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.cotswold_bricks), BuilderModBlocks.aged_bricks);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BRICK_BLOCK, 1), BuilderModBlocks.cotswold_bricks);
		
		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.andesite, 1), new ItemStack(Blocks.STONE, 1, 5));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 5), BuilderModBlocks.andesite);
		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.andesite_smooth, 4), "xx", "xx", 'x', new ItemStack(BuilderModBlocks.andesite, 1));
		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.andesite_bricks, 4), "xx", "xx", 'x', new ItemStack(BuilderModBlocks.andesite_smooth, 1));

		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.granite, 1), new ItemStack(Blocks.STONE, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 1), BuilderModBlocks.granite);
		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.granite_smooth, 4), "xx", "xx", 'x', new ItemStack(BuilderModBlocks.granite, 1));
		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.granite_bricks, 4), "xx", "xx", 'x', new ItemStack(BuilderModBlocks.granite_smooth, 1));

		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.diorite, 1), new ItemStack(Blocks.STONE, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 3), BuilderModBlocks.diorite);
		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.diorite_smooth, 4), "xx", "xx", 'x', new ItemStack(BuilderModBlocks.diorite, 1));
		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.diorite_bricks, 4), "xx", "xx", 'x', new ItemStack(BuilderModBlocks.diorite_smooth, 1));

		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.sand, 1), Blocks.SANDSTONE);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SANDSTONE), BuilderModBlocks.sand);
		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.sand_smooth, 4), "xx", "xx", 'x', new ItemStack(BuilderModBlocks.sand, 1));
		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.sand_bricks, 4), "xx", "xx", 'x', new ItemStack(BuilderModBlocks.sand_smooth, 1));

		GameRegistry.addSmelting(BuilderModBlocks.andesite_cobblestone, new ItemStack(BuilderModBlocks.andesite), .1f);
		GameRegistry.addSmelting(BuilderModBlocks.granite_cobblestone, new ItemStack(BuilderModBlocks.granite), .1f);
		GameRegistry.addSmelting(BuilderModBlocks.diorite_cobblestone, new ItemStack(BuilderModBlocks.diorite), .1f);
		GameRegistry.addSmelting(BuilderModBlocks.sand_cobblestone, new ItemStack(BuilderModBlocks.sand), .1f);

		GameRegistry.addSmelting(BuilderModBlocks.limestone_cobblestone, new ItemStack(BuilderModBlocks.limestone), .1f);
		GameRegistry.addSmelting(BuilderModBlocks.marble_cobblestone, new ItemStack(BuilderModBlocks.marble), .1f);
		GameRegistry.addSmelting(BuilderModBlocks.basalt_cobblestone, new ItemStack(BuilderModBlocks.basalt), .1f);

		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.limestone_smooth, 4), "xx", "xx", 'x', new ItemStack(BuilderModBlocks.limestone, 1, 5));
		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.limestone_bricks, 4), "xx", "xx", 'x', new ItemStack(BuilderModBlocks.limestone_smooth, 1, 5));

		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.marble_smooth, 4), "xx", "xx", 'x', new ItemStack(BuilderModBlocks.marble, 1, 5));
		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.marble_bricks, 4), "xx", "xx", 'x', new ItemStack(BuilderModBlocks.marble_smooth, 1, 5));

		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.basalt_smooth, 4), "xx", "xx", 'x', new ItemStack(BuilderModBlocks.basalt, 1, 5));
		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.basalt_bricks, 4), "xx", "xx", 'x', new ItemStack(BuilderModBlocks.basalt_smooth, 1, 5));

		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.missing, 3), "X", "C", 'X', Items.DIAMOND, 'C', Items.IRON_INGOT);
	}
}
