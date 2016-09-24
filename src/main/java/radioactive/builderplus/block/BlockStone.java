package radioactive.builderplus.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockStone extends Block
{
	private Block $m_dropped_block;

	public BlockStone(Block dropped_block)
	{
		super(Material.ROCK);

		$m_dropped_block = dropped_block;
	}

	@Nullable @Override public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock($m_dropped_block);
	}
}
