/*
ModuleClass : ExtendedCarbonDioxideSensorAnnc



This ModuleClass provides carbon dioxide data.

Created: 2017-08-09 15:38:05
*/

package org.eclipse.om2m.commons.resource.flexcontainerspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.om2m.commons.resource.AbstractFlexContainer;
import org.eclipse.om2m.commons.resource.AbstractFlexContainerAnnc;


@XmlRootElement(name = ExtendedCarbonDioxideSensorFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = ExtendedCarbonDioxideSensorFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class ExtendedCarbonDioxideSensorFlexContainerAnnc extends AbstractFlexContainerAnnc {
	
	public static final String LONG_NAME = "extendedCarbonDioxideSensorAnnc";
	public static final String SHORT_NAME = "eCDSrAnnc";
	
	public ExtendedCarbonDioxideSensorFlexContainerAnnc () {
		setContainerDefinition("org.onem2m.home.moduleclass." + ExtendedCarbonDioxideSensorFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
	}
	
}