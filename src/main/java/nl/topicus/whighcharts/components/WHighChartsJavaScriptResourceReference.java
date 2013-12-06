package nl.topicus.whighcharts.components;

import org.apache.wicket.Application;
import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.resource.JQueryPluginResourceReference;

public class WHighChartsJavaScriptResourceReference extends JQueryPluginResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighChartsJavaScriptResourceReference INSTANCE =
		new WHighChartsJavaScriptResourceReference();

	private WHighChartsJavaScriptResourceReference()
	{
		super(WHighChartsJavaScriptResourceReference.class, getResourceName());
	}

	private static String getResourceName()
	{
		String base = "highcharts.js";

		if (RuntimeConfigurationType.DEVELOPMENT == Application.get().getConfigurationType())
		{
			base = "highcharts.src.js";
		}

		return base;
	}

	public static WHighChartsJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
