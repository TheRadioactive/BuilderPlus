package radioactive.builderplus;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import radioactive.builderplus.init.BuilderModBlocks;
import radioactive.builderplus.init.BuilderModCrafting;
import radioactive.builderplus.init.BuilderModItems;
import radioactive.builderplus.proxy.CommonProxy;
import radioactive.builderplus.tab.BuilderPlusCreativeTab;

@Mod(name = Info._name, modid = Info._id, version = Info._version) public class BuilderMod
{
	@SidedProxy(clientSide = Info._proxy_client, serverSide = Info._proxy_server) private static CommonProxy $m_proxy;

	@Mod.Instance private static BuilderMod $m_INSTANCE;

	private static BuilderPlusCreativeTab $m_creative_tab;

	public static BuilderMod GetInstance()
	{
		return $m_INSTANCE;
	}
	
	public BuilderPlusCreativeTab GetCreativeTab()
	{
		return $m_creative_tab;
	}

	@Mod.EventHandler public void PreInit(FMLPreInitializationEvent event)
	{
		$m_creative_tab = new BuilderPlusCreativeTab();

		$m_proxy.PreInit(event);
		BuilderModItems.PreInit();
		BuilderModBlocks.PreInit();
	}

	@Mod.EventHandler public void Init(FMLInitializationEvent event)
	{
		$m_proxy.Init(event);
		BuilderModCrafting.Register();
	}

	@Mod.EventHandler public void PostInit(FMLPostInitializationEvent event)
	{
		$m_proxy.PostInit(event);
	}
}
