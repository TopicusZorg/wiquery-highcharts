package nl.topicus.whighstock.components.modules;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighStockCanvasToolJavaScriptResourceReference extends
	WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -6170700931152674507L;

	private static WHighStockCanvasToolJavaScriptResourceReference INSTANCE =
		new WHighStockCanvasToolJavaScriptResourceReference();

	private WHighStockCanvasToolJavaScriptResourceReference()
	{
		super(WHighStockCanvasToolJavaScriptResourceReference.class,
			"jquery.highstock.exporting.js");
	}

	public static WHighStockCanvasToolJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
