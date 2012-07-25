package nl.topicus.whighstock.components.adapters;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class WHighStockMooToolsJavaScriptResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -4940713260764725037L;

	private static WHighStockMooToolsJavaScriptResourceReference INSTANCE =
		new WHighStockMooToolsJavaScriptResourceReference();

	private WHighStockMooToolsJavaScriptResourceReference()
	{
		super(WHighStockMooToolsJavaScriptResourceReference.class,
			"mootools-adapter.js");
	}

	public static WHighStockMooToolsJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
