package radioactive.builderplus;

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
		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.andesite_cobblestone, 1), BuilderModBlocks.andesite);
		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.andesite_bricks), BuilderModBlocks.andesite_cobblestone);
		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.andesite_smooth), BuilderModBlocks.andesite_bricks);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 5), BuilderModBlocks.andesite_smooth);
		
		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.granite, 1), new ItemStack(Blocks.STONE, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.granite_cobblestone, 1), BuilderModBlocks.granite);
		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.granite_bricks), BuilderModBlocks.granite_cobblestone);
		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.granite_smooth), BuilderModBlocks.granite_bricks);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 1), BuilderModBlocks.granite_smooth);
		
		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.diorite, 1), new ItemStack(Blocks.STONE, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.diorite_cobblestone, 1), BuilderModBlocks.diorite);
		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.diorite_bricks), BuilderModBlocks.diorite_cobblestone);
		GameRegistry.addShapelessRecipe(new ItemStack(BuilderModBlocks.diorite_smooth), BuilderModBlocks.diorite_bricks);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 3), BuilderModBlocks.diorite_smooth);
	
		GameRegistry.addShapedRecipe(new ItemStack(BuilderModBlocks.missing, 3), "X", "C", 'X', Items.DIAMOND, 'C', Items.IRON_INGOT);
	}
}
