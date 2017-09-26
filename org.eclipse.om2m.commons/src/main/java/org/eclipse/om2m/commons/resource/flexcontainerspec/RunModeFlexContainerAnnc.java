/*
********************************************************************************
 * Copyright (c) 2014, 2017 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ********************************************************************************

ModuleClass : RunModeAnnc

This ModuleClasses provides capabilities to control and monitor  the operational modes of appliances.

Created: 2017-09-26 14:55:54
*/

package org.eclipse.om2m.commons.resource.flexcontainerspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.om2m.commons.resource.AbstractFlexContainer;
import org.eclipse.om2m.commons.resource.AbstractFlexContainerAnnc;


@XmlRootElement(name = RunModeFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = RunModeFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class RunModeFlexContainerAnnc extends AbstractFlexContainerAnnc {
	
	public static final String LONG_NAME = "runModeAnnc";
	public static final String SHORT_NAME = "runMeAnnc";
	
	public RunModeFlexContainerAnnc () {
		setContainerDefinition("org.onem2m.home.moduleclass." + RunModeFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
	}
	
	public void finalizeDeserialization() {
	}
	
}