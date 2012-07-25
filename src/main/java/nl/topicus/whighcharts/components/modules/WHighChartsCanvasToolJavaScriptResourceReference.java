package nl.topicus.whighcharts.components.modules;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class WHighChartsCanvasToolJavaScriptResourceReference extends JavaScriptResourceReference
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
