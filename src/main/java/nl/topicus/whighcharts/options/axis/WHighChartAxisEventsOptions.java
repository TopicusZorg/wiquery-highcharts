package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartFunction;
import nl.topicus.whighcharts.options.WHighChartFunctionString;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisEventsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Fires when the minimum and maximum is set for the axis, either by calling the .setExtremes() method or by
	 * selecting an area in the chart. The this keyword refers to the axis object itself. One parameter, event, is
	 * passed to the function. This contains common event information based on jQuery or MooTools depending on which
	 * library is used as the base for Highcharts. The new user set minimum and maximum values can be found by event.min
	 * and event.max.
	 */
	private WHighChartFunction setExtremes;

	/**
	 * @return the setExtremes
	 */
	public WHighChartFunction getSetExtremes()
	{
		return setExtremes;
	}

	/**
	 * @param setExtremes
	 *            the setExtremes to set
	 */
	public WHighChartAxisEventsOptions setSetExtremes(WHighChartFunction setExtremes)
	{
		this.setExtremes = setExtremes;
		return this;
	}

	public WHighChartAxisEventsOptions setSetExtremes(String formatter)
	{
		return setSetExtremes(new WHighChartFunctionString(formatter));
	}
}
