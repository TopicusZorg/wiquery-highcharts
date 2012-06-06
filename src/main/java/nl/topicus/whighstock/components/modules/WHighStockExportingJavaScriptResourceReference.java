package nl.topicus.whighstock.components.modules;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighStockExportingJavaScriptResourceReference extends
	WiQueryJavaScriptResourceReference
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
