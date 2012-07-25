package nl.topicus.whighstock.components.adapters;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class WHighStockPrototypeJavaScriptResourceReference extends JavaScriptResourceReference
{

	private static final long serialVersionUID = 8963995776094930442L;

	private static WHighStockPrototypeJavaScriptResourceReference INSTANCE =
		new WHighStockPrototypeJavaScriptResourceReference();

	private WHighStockPrototypeJavaScriptResourceReference()
	{
		super(WHighStockPrototypeJavaScriptResourceReference.class,
			"prototype-adapter.js");
	}

	public static WHighStockPrototypeJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
