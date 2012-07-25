package nl.topicus.whighcharts.components.themes;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class WHighChartSkiesJavaScriptResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighChartSkiesJavaScriptResourceReference INSTANCE =
		new WHighChartSkiesJavaScriptResourceReference();

	private WHighChartSkiesJavaScriptResourceReference()
	{
		super(WHighChartSkiesJavaScriptResourceReference.class,
			"skies.js");
	}

	public static WHighChartSkiesJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
