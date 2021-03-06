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
package org.eclipse.om2m.datamapping.jaxb;

import java.util.Dictionary;
import java.util.Hashtable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.om2m.commons.constants.MimeMediaType;
import org.eclipse.om2m.datamapping.service.DataMapperService;
import org.osgi.annotation.bundle.Header;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;

@Header(name = Constants.BUNDLE_ACTIVATOR, value = "${@class}")
public class Activator implements BundleActivator {

	private static BundleContext context;
	
	/** Activator LOGGER */
	private static final Log LOGGER = LogFactory.getLog(Activator.class);

	protected static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		LOGGER.info("Starting Data Mapper");
		Activator.context = bundleContext;

		// Register XML Mapper Service
		LOGGER.info("Registering XML Mapper Service..");
		Dictionary <String, String> xmlDataMapperServiceProperties = new Hashtable<>();
		xmlDataMapperServiceProperties.put("type", MimeMediaType.XML);
		context.registerService(DataMapperService.class.getName(), new Mapper(MimeMediaType.XML), xmlDataMapperServiceProperties);
		LOGGER.info("XML Mapper service registered.");
		
		// register JSON mapper service
		LOGGER.info("Registering JSON Mapper Service..");
		Dictionary<String, String> jsonDataMapperServiceProperties = new Hashtable<>();
		jsonDataMapperServiceProperties.put("type", MimeMediaType.JSON);
		context.registerService(DataMapperService.class.getName(), new Mapper(MimeMediaType.JSON), jsonDataMapperServiceProperties);

		LOGGER.info("JSON Mapper service registered.");
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
