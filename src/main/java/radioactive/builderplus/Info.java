package radioactive.builderplus;

public class Info
{
	public static final String _name    = "Builder Plus";
	public static final String _id      = "builderplus";
	public static final String _version = "1.0";

	public static final String _proxy_client = "radioactive.builderplus.proxy.ClientProxy";
	public static final String _proxy_server = "radioactive.builderplus.proxy.CommonProxy";

	public static final String _creative_tab_name = "tab_" + _id;

	public static enum BuilderItems
	{
		NULL("", "");
		
		private String unlocalizedname, registryname;

		BuilderItems(String unlocalizedname, String registryname)
		{
			this.unlocalizedname = unlocalizedname;
			this.registryname = registryname;
		}

		public String getUnlocalizedname()
		{
			return unlocalizedname;
		}

		public String getRegistryname()
		{
			return registryname;
		}
	}
	
	public static enum BuilderBlocks
	{
		MIXED_BRICKS("mixed_bricks", "mixed_bricks"),
		AGED_BRICKS("rusty_bricks", "rusty_bricks"),
		MISSING_TEXTURE("missing", "missing");

		private String unlocalizedname, registryname;

		BuilderBlocks(String unlocalizedname, String registryname)
		{
			this.unlocalizedname = unlocalizedname;
			this.registryname = registryname;
		}

		public String getUnlocalizedname()
		{
			return unlocalizedname;
		}

		public String getRegistryname()
		{
			return registryname;
		}
	}
}
