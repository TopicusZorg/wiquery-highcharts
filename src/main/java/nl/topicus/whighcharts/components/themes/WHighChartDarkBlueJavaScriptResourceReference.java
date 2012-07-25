package nl.topicus.whighcharts.components.themes;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class WHighChartDarkBlueJavaScriptResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighChartDarkBlueJavaScriptResourceReference INSTANCE =
		new WHighChartDarkBlueJavaScriptResourceReference();

	private WHighChartDarkBlueJavaScriptResourceReference()
	{
		super(WHighChartDarkBlueJavaScriptResourceReference.class,
			"dark-blue.js");
	}

	public static WHighChartDarkBlueJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
