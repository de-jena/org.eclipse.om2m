/*
ModuleClass : Recorder



This ModuleClass provides the capability to record the  video/audio for a defined duration.

Created: 2017-07-17 15:25:54
*/

package org.eclipse.om2m.commons.resource.flexcontainerspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.om2m.commons.resource.AbstractFlexContainer;


@XmlRootElement(name = RecorderFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = RecorderFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class RecorderFlexContainer extends AbstractFlexContainer {
	
	public static final String LONG_NAME = "recorder";
	public static final String SHORT_NAME = "recor";
	
	public RecorderFlexContainer () {
		setContainerDefinition("org.onem2m.home.moduleclass." + LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
	}
	
}