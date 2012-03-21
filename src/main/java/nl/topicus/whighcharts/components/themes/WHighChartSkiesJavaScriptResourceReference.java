package nl.topicus.whighcharts.components.themes;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighChartSkiesJavaScriptResourceReference extends
	WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighChartSkiesJavaScriptResourceReference INSTANCE =
		new WHighChartSkiesJavaScriptResourceReference();

	private WHighChartSkiesJavaScriptResourceReference()
	{
		super(WHighChartSkiesJavaScriptResourceReference.class,
			"jquery.highcharts.skies.js");
	}

	public static WHighChartSkiesJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
