/*
ModuleClass : Refrigeration



This ModuleClass describes a refrigeration function. This is not  a Refrigerator device. The filter state is a read-only value  providing the percentage life time remaining for the water filter.  RapidFreeze is a boolean that controls the rapid freeze capability  if present. RapidCool is a boolean that controls the rapid cool  capability if present. Defrost is a boolean that controls the  defrost cycle if present.

Created: 2017-07-17 15:25:54
*/

package org.eclipse.om2m.commons.resource.flexcontainerspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.om2m.commons.resource.AbstractFlexContainer;


@XmlRootElement(name = RefrigerationFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = RefrigerationFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class RefrigerationFlexContainer extends AbstractFlexContainer {
	
	public static final String LONG_NAME = "refrigeration";
	public static final String SHORT_NAME = "refrn";
	
	public RefrigerationFlexContainer () {
		setContainerDefinition("org.onem2m.home.moduleclass." + LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
	}
	
}