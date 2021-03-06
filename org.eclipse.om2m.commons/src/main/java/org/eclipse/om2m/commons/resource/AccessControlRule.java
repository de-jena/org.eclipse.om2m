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
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.om2m.commons.constants.ShortName;

/**
 * <p>
 * Java class for accessControlRule complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="accessControlRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessControlOriginators" type="{http://www.onem2m.org/xml/protocols}listOfURIs"/>
 *         &lt;element name="accessControlOperations" type="{http://www.onem2m.org/xml/protocols}accessControlOperations"/>
 *         &lt;element name="accessControlContexts" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="accessControlWindow" type="{http://www.onem2m.org/xml/protocols}scheduleEntry" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="accessControlIpAddresses" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ipv4Addresses" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;list itemType="{http://www.onem2m.org/xml/protocols}ipv4" />
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ipv6Addresses" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;list itemType="{http://www.onem2m.org/xml/protocols}ipv6" />
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="accessControlLocationRegion" type="{http://www.onem2m.org/xml/protocols}locationRegion" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = ShortName.ACR)
public class AccessControlRule {

	@XmlList
	@XmlElement(name = ShortName.ACOR, required = true, namespace="")
	protected List<String> accessControlOriginators;
	@XmlElement(name = ShortName.ACOP, required = true, namespace="")
	protected BigInteger accessControlOperations;
	@XmlElement(name = ShortName.ACCO, namespace="")
	protected List<AccessControlRule.AccessControlContexts> accessControlContexts;

	/**
	 * Gets the value of the accessControlOriginators property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the accessControlOriginators property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAccessControlOriginators().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getAccessControlOriginators() {
		if (accessControlOriginators == null) {
			accessControlOriginators = new ArrayList<String>();
		}
		return this.accessControlOriginators;
	}

	/**
	 * Gets the value of the accessControlOperations property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getAccessControlOperations() {
		return accessControlOperations;
	}

	/**
	 * Sets the value of the accessControlOperations property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setAccessControlOperations(BigInteger value) {
		this.accessControlOperations = value;
	}

	/**
	 * Gets the value of the accessControlContexts property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the accessControlContexts property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAccessControlContexts().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AccessControlRule.AccessControlContexts }
	 * 
	 * 
	 */
	public List<AccessControlRule.AccessControlContexts> getAccessControlContexts() {
		if (accessControlContexts == null) {
			accessControlContexts = new ArrayList<AccessControlRule.AccessControlContexts>();
		}
		return this.accessControlContexts;
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
	 *         &lt;element name="accessControlWindow" type="{http://www.onem2m.org/xml/protocols}scheduleEntry" maxOccurs="unbounded" minOccurs="0"/>
	 *         &lt;element name="accessControlIpAddresses" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="ipv4Addresses" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;list itemType="{http://www.onem2m.org/xml/protocols}ipv4" />
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="ipv6Addresses" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;list itemType="{http://www.onem2m.org/xml/protocols}ipv6" />
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="accessControlLocationRegion" type="{http://www.onem2m.org/xml/protocols}locationRegion" minOccurs="0"/>
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
	public static class AccessControlContexts {

		@XmlElement(name = ShortName.ACTW)
		protected List<String> accessControlWindow;
		@XmlElement(name = ShortName.ACIP)
		protected AccessControlRule.AccessControlContexts.AccessControlIpAddresses accessControlIpAddresses;
		@XmlElement(name = ShortName.ACLR)
		protected LocationRegion accessControlLocationRegion;

		/**
		 * Gets the value of the accessControlWindow property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the accessControlWindow property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getAccessControlWindow().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link String }
		 * 
		 * 
		 */
		public List<String> getAccessControlWindow() {
			if (accessControlWindow == null) {
				accessControlWindow = new ArrayList<String>();
			}
			return this.accessControlWindow;
		}

		/**
		 * Gets the value of the accessControlIpAddresses property.
		 * 
		 * @return possible object is
		 *         {@link AccessControlRule.AccessControlContexts.AccessControlIpAddresses }
		 * 
		 */
		public AccessControlRule.AccessControlContexts.AccessControlIpAddresses getAccessControlIpAddresses() {
			return accessControlIpAddresses;
		}

		/**
		 * Sets the value of the accessControlIpAddresses property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link AccessControlRule.AccessControlContexts.AccessControlIpAddresses }
		 * 
		 */
		public void setAccessControlIpAddresses(
				AccessControlRule.AccessControlContexts.AccessControlIpAddresses value) {
			this.accessControlIpAddresses = value;
		}

		/**
		 * Gets the value of the accessControlLocationRegion property.
		 * 
		 * @return possible object is {@link LocationRegion }
		 * 
		 */
		public LocationRegion getAccessControlLocationRegion() {
			return accessControlLocationRegion;
		}

		/**
		 * Sets the value of the accessControlLocationRegion property.
		 * 
		 * @param value
		 *            allowed object is {@link LocationRegion }
		 * 
		 */
		public void setAccessControlLocationRegion(LocationRegion value) {
			this.accessControlLocationRegion = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="ipv4Addresses" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;list itemType="{http://www.onem2m.org/xml/protocols}ipv4" />
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="ipv6Addresses" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;list itemType="{http://www.onem2m.org/xml/protocols}ipv6" />
		 *           &lt;/simpleType>
		 *         &lt;/element>
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
		public static class AccessControlIpAddresses {

			@XmlList
			@XmlElement(name = ShortName.IPV4)
			protected List<String> ipv4Addresses;
			@XmlList
			@XmlElement(name = ShortName.IPV6)
			protected List<String> ipv6Addresses;

			/**
			 * Gets the value of the ipv4Addresses property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the ipv4Addresses property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getIpv4Addresses().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link String }
			 * 
			 * 
			 */
			public List<String> getIpv4Addresses() {
				if (ipv4Addresses == null) {
					ipv4Addresses = new ArrayList<String>();
				}
				return this.ipv4Addresses;
			}

			/**
			 * Gets the value of the ipv6Addresses property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the ipv6Addresses property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getIpv6Addresses().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link String }
			 * 
			 * 
			 */
			public List<String> getIpv6Addresses() {
				if (ipv6Addresses == null) {
					ipv6Addresses = new ArrayList<String>();
				}
				return this.ipv6Addresses;
			}

		}

	}

}
