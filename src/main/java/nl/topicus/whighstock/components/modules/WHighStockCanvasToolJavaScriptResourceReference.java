package nl.topicus.whighstock.components.modules;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class WHighStockCanvasToolJavaScriptResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -6170700931152674507L;

	private static WHighStockCanvasToolJavaScriptResourceReference INSTANCE =
		new WHighStockCanvasToolJavaScriptResourceReference();

	private WHighStockCanvasToolJavaScriptResourceReference()
	{
		super(WHighStockCanvasToolJavaScriptResourceReference.class,
			"exporting.js");
	}

	public static WHighStockCanvasToolJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
