package nl.topicus.whighcharts.components.themes;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class WHighChartDarkGreenJavaScriptResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -2687372577252173763L;

	private static WHighChartDarkGreenJavaScriptResourceReference INSTANCE =
		new WHighChartDarkGreenJavaScriptResourceReference();

	private WHighChartDarkGreenJavaScriptResourceReference()
	{
		super(WHighChartDarkGreenJavaScriptResourceReference.class,
			"dark-green.js");
	}

	public static WHighChartDarkGreenJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
