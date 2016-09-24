package radioactive.builderplus.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class ItemBrickChisel extends Item
{
	public static Random random = new Random();

	public ItemBrickChisel()
	{
		this.setMaxStackSize(1);
		this.setMaxDamage(1200);
	}

	public boolean hasContainerItem(ItemStack stack)
	{
		return true;
	}

	public ItemStack getContainerItem(ItemStack stack)
	{
		ItemStack ret = stack.copy();
		ret.attemptDamageItem(1, random);

		return ret;
	}
}
