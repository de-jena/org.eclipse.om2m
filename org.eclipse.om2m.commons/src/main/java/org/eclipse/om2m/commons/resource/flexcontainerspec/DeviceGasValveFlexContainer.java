/*
********************************************************************************
 * Copyright (c) 2014, 2018 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 ********************************************************************************

Device : DeviceGasValve

A gas valve is a device that is used to turn the gas supply ON or OFF remotely.

Created: 2018-06-29 17:19:56
*/

package org.eclipse.om2m.commons.resource.flexcontainerspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.om2m.commons.resource.AbstractFlexContainer;

@XmlRootElement(name = DeviceGasValveFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = DeviceGasValveFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class DeviceGasValveFlexContainer extends AbstractFlexContainer {
	
	public static final String LONG_NAME = "deviceGasValve";
	public static final String SHORT_NAME = "deGVe";
	
	public DeviceGasValveFlexContainer () {
		setContainerDefinition("org.onem2m.home.device." + DeviceGasValveFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
    public void finalizeSerialization() {
		getOpenLevel();
	}
	
	public void finalizeDeserialization() {
		if (this.openLevel != null) {
			setOpenLevel(this.openLevel);
		}
	}

	@XmlElement(name=OpenLevelFlexContainer.SHORT_NAME, required=true, type=OpenLevelFlexContainer.class, namespace="http://www.onem2m.org/xml/protocols/homedomain")
	private OpenLevelFlexContainer openLevel;
		
	public void setOpenLevel(OpenLevelFlexContainer openLevel) {
		this.openLevel = openLevel;
		getFlexContainerOrContainerOrSubscription().add(openLevel);
	}
	
	public OpenLevelFlexContainer getOpenLevel() {
		this.openLevel = (OpenLevelFlexContainer) getResourceByName(OpenLevelFlexContainer.SHORT_NAME);
		return openLevel;
	}
	
}
