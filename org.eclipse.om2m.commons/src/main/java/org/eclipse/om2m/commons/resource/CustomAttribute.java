/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.om2m.commons.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.om2m.commons.constants.ShortName;
import org.w3c.dom.Element;

@XmlAccessorType(XmlAccessType.NONE)
@XmlJavaTypeAdapter(CustomAttributeAdapter.class)
public class CustomAttribute {
	
	private String customAttributeName;
	
	private String customAttributeValue;
	
	private String customAttributeType;

	public String getCustomAttributeName() {
		return customAttributeName;
	}

	public void setCustomAttributeName(String customAttributeName) {
		this.customAttributeName = customAttributeName;
	}

	public String getCustomAttributeValue() {
		return customAttributeValue;
	}

	public void setCustomAttributeValue(String customAttributeValue) {
		this.customAttributeValue = customAttributeValue;
	}

	public String getCustomAttributeType() {
		return customAttributeType;
	}

	public void setCustomAttributeType(String customAttributeType) {
		this.customAttributeType = customAttributeType;
	}

	@Override
	public String toString() {
		return "<CustomAttribute " + customAttributeName + "/" +
				customAttributeType + "/" + customAttributeValue + "/>";
	}
	
}
