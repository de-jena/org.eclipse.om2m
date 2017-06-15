package org.eclipse.om2m.commons.resource.flexcontainerspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.om2m.commons.resource.FlexContainer;

@XmlRootElement(name=DeviceWaterValveFlexContainer.SHORT_NAME, namespace="http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name=DeviceWaterValveFlexContainer.SHORT_NAME, namespace="http://www.onem2m.org/xml/protocols/homedomain")
public class DeviceWaterValveFlexContainer extends FlexContainer {
	
	public static final String LONG_NAME = "deviceWaterValve";
	public static final String SHORT_NAME = "devWV";
	
	
	public DeviceWaterValveFlexContainer() {
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}

}