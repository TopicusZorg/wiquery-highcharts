package nl.topicus.whighstock.components;

import org.apache.wicket.Application;
import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.resource.JQueryPluginResourceReference;

public class WHighStockJavaScriptResourceReference extends JQueryPluginResourceReference
{
	private static final long serialVersionUID = -3102442307594519480L;

	private static WHighStockJavaScriptResourceReference INSTANCE =
		new WHighStockJavaScriptResourceReference();

	private WHighStockJavaScriptResourceReference()
	{
		super(WHighStockJavaScriptResourceReference.class, getResourceName());
	}

	private static String getResourceName()
	{
		String base = "highstock.js";

		if (RuntimeConfigurationType.DEVELOPMENT == Application.get().getConfigurationType())
		{
			base = "highstock.src.js";
		}

		return base;
	}

	public static WHighStockJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
