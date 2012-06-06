package nl.topicus.whighcharts.components.modules;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighChartsCanvasToolJavaScriptResourceReference extends
	WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighChartsCanvasToolJavaScriptResourceReference INSTANCE =
		new WHighChartsCanvasToolJavaScriptResourceReference();

	private WHighChartsCanvasToolJavaScriptResourceReference()
	{
		super(WHighChartsCanvasToolJavaScriptResourceReference.class,
			"canvas-tools.js");
	}

	public static WHighChartsCanvasToolJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
