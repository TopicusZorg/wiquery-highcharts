package nl.topicus.whighcharts.options;

import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteSerializer;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes;
import org.apache.wicket.request.IRequestParameters;
import org.apache.wicket.request.cycle.RequestCycle;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(using = ToStringNoQuoteSerializer.class)
public class WHighChartFunctionCallback extends AbstractDefaultAjaxBehavior implements
	WHighChartFunction
{
	private static final long serialVersionUID = 1L;

	public WHighChartFunctionCallback(Component component)
	{
		component.add(this);
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("function(event){\n ");
		builder.append(getCallbackScript());
		builder.append("\n }");
		return builder.toString();
	}

	/**
	 * @see org.apache.wicket.ajax.AbstractDefaultAjaxBehavior#updateAjaxAttributes(org.apache.wicket.ajax.attributes.AjaxRequestAttributes)
	 */
	@Override
	protected void updateAjaxAttributes(AjaxRequestAttributes attributes)
	{
		super.updateAjaxAttributes(attributes);
		attributes.getDynamicExtraParameters().add("wHighChartsSerializeEvent(event)");
	}

	@Override
	protected void respond(AjaxRequestTarget target)
	{
		IRequestParameters map = RequestCycle.get().getRequest().getRequestParameters();
		WHighChartFunctionEvent event = new WHighChartFunctionEvent(map);
		onEvent(event, target);
	}

	@SuppressWarnings("unused")
	public void onEvent(WHighChartFunctionEvent event, AjaxRequestTarget target)
	{

	}
}
