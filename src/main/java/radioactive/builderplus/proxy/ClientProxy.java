package radioactive.builderplus.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import radioactive.builderplus.init.BuilderModBlocks;
import radioactive.builderplus.init.BuilderModItems;

public class ClientProxy extends CommonProxy
{
	@Override public void PreInit(FMLPreInitializationEvent event)
	{
	}

	@Override public void Init(FMLInitializationEvent event)
	{
		BuilderModItems.RegisterRenders();
		BuilderModBlocks.RegisterRenders();
	}

	@Override public void PostInit(FMLPostInitializationEvent event)
	{
	}
}
