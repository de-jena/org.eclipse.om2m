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

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.om2m.commons.constants.ShortName;

/**
 * <p>
 * Java class for metaInformation complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="metaInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceType" type="{http://www.onem2m.org/xml/protocols}resourceType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originatingTimestamp" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="requestExpirationTimestamp" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="resultExpirationTimestamp" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="operationalExecutionTime" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="responseType" type="{http://www.onem2m.org/xml/protocols}responseType" minOccurs="0"/>
 *         &lt;element name="resultPersistence" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="resultContent" type="{http://www.onem2m.org/xml/protocols}resultContent" minOccurs="0"/>
 *         &lt;element name="eventCategory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="eventCatType" type="{http://www.onem2m.org/xml/protocols}eventCat"/>
 *                   &lt;element name="eventCatNo" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="deliveryAggregation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="groupRequestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterCriteria" type="{http://www.onem2m.org/xml/protocols}filterCriteria" minOccurs="0"/>
 *         &lt;element name="discoveryResultType" type="{http://www.onem2m.org/xml/protocols}discResType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = ShortName.META_INFORMATION)
public class MetaInformation {
	@XmlElement(name = ShortName.RESOURCE_TYPE)
	protected BigInteger resourceType;
	@XmlElement(name = ShortName.NAME)
	protected String name;
	@XmlElement(name = ShortName.ORIGINATING_TIMESTAMP)
	protected String originatingTimestamp;
	@XmlElement(name = ShortName.REQUEST_EXPIRATION_TIMESTAMP)
	protected String requestExpirationTimestamp;
	@XmlElement(name = ShortName.RESULT_EXPIRATION_TIMESTAMP)
	protected String resultExpirationTimestamp;
	@XmlElement(name = ShortName.OPERATION_EXECUTION_TIME)
	protected String operationalExecutionTime;
	@XmlElement(name = ShortName.RESPONSE_TYPE)
	protected BigInteger responseType;
	@XmlElement(name = ShortName.RESULT_PERSISTENCE)
	protected String resultPersistence;
	@XmlElement(name = ShortName.RESULT_CONTENT)
	protected BigInteger resultContent;
	@XmlElement(name = ShortName.EVENT_CATEGORY)
	protected MetaInformation.EventCategory eventCategory;
	@XmlElement(name = ShortName.DELIVERY_AGGREGATION)
	protected Boolean deliveryAggregation;
	@XmlElement(name = ShortName.GROUP_REQUEST_IDENTIFIER)
	protected String groupRequestIdentifier;
	@XmlElement(name = ShortName.FILTER_CRITERIA)
	protected FilterCriteria filterCriteria;
	@XmlElement(name = ShortName.DISCOVERY_RESULT_TYPE)
	protected BigInteger discoveryResultType;

	/**
	 * Gets the value of the resourceType property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getResourceType() {
		return resourceType;
	}

	/**
	 * Sets the value of the resourceType property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setResourceType(BigInteger value) {
		this.resourceType = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the originatingTimestamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOriginatingTimestamp() {
		return originatingTimestamp;
	}

	/**
	 * Sets the value of the originatingTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOriginatingTimestamp(String value) {
		this.originatingTimestamp = value;
	}

	/**
	 * Gets the value of the requestExpirationTimestamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRequestExpirationTimestamp() {
		return requestExpirationTimestamp;
	}

	/**
	 * Sets the value of the requestExpirationTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequestExpirationTimestamp(String value) {
		this.requestExpirationTimestamp = value;
	}

	/**
	 * Gets the value of the resultExpirationTimestamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResultExpirationTimestamp() {
		return resultExpirationTimestamp;
	}

	/**
	 * Sets the value of the resultExpirationTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResultExpirationTimestamp(String value) {
		this.resultExpirationTimestamp = value;
	}

	/**
	 * Gets the value of the operationalExecutionTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOperationalExecutionTime() {
		return operationalExecutionTime;
	}

	/**
	 * Sets the value of the operationalExecutionTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOperationalExecutionTime(String value) {
		this.operationalExecutionTime = value;
	}

	/**
	 * Gets the value of the responseType property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getResponseType() {
		return responseType;
	}

	/**
	 * Sets the value of the responseType property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setResponseType(BigInteger value) {
		this.responseType = value;
	}

	/**
	 * Gets the value of the resultPersistence property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResultPersistence() {
		return resultPersistence;
	}

	/**
	 * Sets the value of the resultPersistence property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResultPersistence(String value) {
		this.resultPersistence = value;
	}

	/**
	 * Gets the value of the resultContent property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getResultContent() {
		return resultContent;
	}

	/**
	 * Sets the value of the resultContent property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setResultContent(BigInteger value) {
		this.resultContent = value;
	}

	/**
	 * Gets the value of the eventCategory property.
	 * 
	 * @return possible object is {@link MetaInformation.EventCategory }
	 * 
	 */
	public MetaInformation.EventCategory getEventCategory() {
		return eventCategory;
	}

	/**
	 * Sets the value of the eventCategory property.
	 * 
	 * @param value
	 *            allowed object is {@link MetaInformation.EventCategory }
	 * 
	 */
	public void setEventCategory(MetaInformation.EventCategory value) {
		this.eventCategory = value;
	}

	/**
	 * Gets the value of the deliveryAggregation property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isDeliveryAggregation() {
		return deliveryAggregation;
	}

	/**
	 * Sets the value of the deliveryAggregation property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setDeliveryAggregation(Boolean value) {
		this.deliveryAggregation = value;
	}

	/**
	 * Gets the value of the groupRequestIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGroupRequestIdentifier() {
		return groupRequestIdentifier;
	}

	/**
	 * Sets the value of the groupRequestIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGroupRequestIdentifier(String value) {
		this.groupRequestIdentifier = value;
	}

	/**
	 * Gets the value of the filterCriteria property.
	 * 
	 * @return possible object is {@link FilterCriteria }
	 * 
	 */
	public FilterCriteria getFilterCriteria() {
		return filterCriteria;
	}

	/**
	 * Sets the value of the filterCriteria property.
	 * 
	 * @param value
	 *            allowed object is {@link FilterCriteria }
	 * 
	 */
	public void setFilterCriteria(FilterCriteria value) {
		this.filterCriteria = value;
	}

	/**
	 * Gets the value of the discoveryResultType property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getDiscoveryResultType() {
		return discoveryResultType;
	}

	/**
	 * Sets the value of the discoveryResultType property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setDiscoveryResultType(BigInteger value) {
		this.discoveryResultType = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="eventCatType" type="{http://www.onem2m.org/xml/protocols}eventCat"/>
	 *         &lt;element name="eventCatNo" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	public static class EventCategory {

		@XmlElement(required = true, name = ShortName.EVENT_CAT_TYPE)
		protected String eventCatType;
		@XmlElement(required = true, name = ShortName.EVENT_CAT_NO)
		@XmlSchemaType(name = "nonNegativeInteger")
		protected BigInteger eventCatNo;

		/**
		 * Gets the value of the eventCatType property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEventCatType() {
			return eventCatType;
		}

		/**
		 * Sets the value of the eventCatType property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEventCatType(String value) {
			this.eventCatType = value;
		}

		/**
		 * Gets the value of the eventCatNo property.
		 * 
		 * @return possible object is {@link BigInteger }
		 * 
		 */
		public BigInteger getEventCatNo() {
			return eventCatNo;
		}

		/**
		 * Sets the value of the eventCatNo property.
		 * 
		 * @param value
		 *            allowed object is {@link BigInteger }
		 * 
		 */
		public void setEventCatNo(BigInteger value) {
			this.eventCatNo = value;
		}

	}

}
