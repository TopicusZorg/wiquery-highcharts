package nl.topicus.whighstock.components;

import org.apache.wicket.resource.JQueryPluginResourceReference;

public class WHighStockJavaScriptResourceReference extends JQueryPluginResourceReference
{
	private static final long serialVersionUID = -3102442307594519480L;

	private static WHighStockJavaScriptResourceReference INSTANCE =
		new WHighStockJavaScriptResourceReference();

	private WHighStockJavaScriptResourceReference()
	{
		super(WHighStockJavaScriptResourceReference.class, "highstock.js");
	}

	public static WHighStockJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
