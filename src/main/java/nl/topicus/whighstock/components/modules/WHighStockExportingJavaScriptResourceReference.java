package nl.topicus.whighstock.components.modules;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class WHighStockExportingJavaScriptResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -6170700931152674507L;

	private static WHighStockExportingJavaScriptResourceReference INSTANCE =
		new WHighStockExportingJavaScriptResourceReference();

	private WHighStockExportingJavaScriptResourceReference()
	{
		super(WHighStockExportingJavaScriptResourceReference.class,
			"canvas-tools.js");
	}

	public static WHighStockExportingJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
