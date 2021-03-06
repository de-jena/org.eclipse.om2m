/*******************************************************************************
 * Copyright (c) 2013-2020 LAAS-CNRS (www.laas.fr)
 * 7 Colonel Roche 31077 Toulouse - France
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Initial Contributors:
 *     Thierry Monteil : Project manager, technical co-manager
 *     Mahdi Ben Alaya : Technical co-manager
 *     Samir Medjiah : Technical co-manager
 *     Khalil Drira : Strategy expert
 *     Guillaume Garzone : Developer
 *     François Aïssaoui : Developer
 *
 * New contributors :
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.15 at 03:56:27 PM CEST 
//

package org.eclipse.om2m.commons.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.om2m.commons.constants.MgmtDefinitionTypes;
import org.eclipse.om2m.commons.constants.ShortName;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}mgmtResource">
 *       &lt;sequence>
 *         &lt;element name="capabilityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attached" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="capabilityActionStatus" type="{http://www.onem2m.org/xml/protocols}actionStatus"/>
 *         &lt;element name="currentState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="disable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = ShortName.DEVICE_CAPABILITY)
public class DeviceCapability extends MgmtObjWithChildren {

	@XmlElement(required = true)
	protected String capabilityName;
	protected boolean attached;
	@XmlElement(required = true)
	protected ActionStatus capabilityActionStatus;
	protected boolean currentState;
	protected Boolean enable;
	protected Boolean disable;
	
	
	public DeviceCapability() {
		super();
		setMgmtDefinition(MgmtDefinitionTypes.DEVICE_CAPABILITY);
	}

	/**
	 * Gets the value of the capabilityName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCapabilityName() {
		return capabilityName;
	}

	/**
	 * Sets the value of the capabilityName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCapabilityName(String value) {
		this.capabilityName = value;
	}

	/**
	 * Gets the value of the attached property.
	 * 
	 */
	public boolean isAttached() {
		return attached;
	}

	/**
	 * Sets the value of the attached property.
	 * 
	 */
	public void setAttached(boolean value) {
		this.attached = value;
	}

	/**
	 * Gets the value of the capabilityActionStatus property.
	 * 
	 * @return possible object is {@link ActionStatus }
	 * 
	 */
	public ActionStatus getCapabilityActionStatus() {
		return capabilityActionStatus;
	}

	/**
	 * Sets the value of the capabilityActionStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link ActionStatus }
	 * 
	 */
	public void setCapabilityActionStatus(ActionStatus value) {
		this.capabilityActionStatus = value;
	}

	/**
	 * Gets the value of the currentState property.
	 * 
	 */
	public boolean isCurrentState() {
		return currentState;
	}

	/**
	 * Sets the value of the currentState property.
	 * 
	 */
	public void setCurrentState(boolean value) {
		this.currentState = value;
	}

	/**
	 * Gets the value of the enable property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Sets the value of the enable property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setEnable(Boolean value) {
		this.enable = value;
	}

	/**
	 * Gets the value of the disable property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isDisable() {
		return disable;
	}

	/**
	 * Sets the value of the disable property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setDisable(Boolean value) {
		this.disable = value;
	}

}
