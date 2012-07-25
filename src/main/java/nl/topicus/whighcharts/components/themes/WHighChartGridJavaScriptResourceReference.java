package nl.topicus.whighcharts.components.themes;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class WHighChartGridJavaScriptResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -5685922696842251887L;

	private static WHighChartGridJavaScriptResourceReference INSTANCE =
		new WHighChartGridJavaScriptResourceReference();

	private WHighChartGridJavaScriptResourceReference()
	{
		super(WHighChartGridJavaScriptResourceReference.class, "grid.js");
	}

	public static WHighChartGridJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
