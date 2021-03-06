package nl.topicus.whighcharts.components.themes;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class WHighChartGreyJavaScriptResourceReference extends JavaScriptResourceReference
{

	private static final long serialVersionUID = 236726750581852083L;

	private static WHighChartGreyJavaScriptResourceReference INSTANCE =
		new WHighChartGreyJavaScriptResourceReference();

	private WHighChartGreyJavaScriptResourceReference()
	{
		super(WHighChartGreyJavaScriptResourceReference.class, "gray.js");
	}

	public static WHighChartGreyJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
