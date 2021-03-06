/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.utils;

import org.osgi.annotation.bundle.Header;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

@Header(name = Constants.BUNDLE_ACTIVATOR, value = "${@class}")
public class Activator implements BundleActivator {

	private BundleContext context;

	public Activator() {
		Logger.info("ctor");
	}

	@Override
	public void start(BundleContext bc) throws Exception {
		Logger.info("Activation");
		this.context = bc;
		ServiceTracker log = new ServiceTracker(context, LogService.class.getName(), null) {
			public Object addingService(ServiceReference ref) {
				LogService logService = (LogService) context.getService(ref);
				Logger.setLogService(logService);
				Logger.info("LogService OK");
				return logService;
			}
			public void removedService(ServiceReference ref, Object service) {
				Logger.unsetLogService();
			}
		};
		log.open();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		Logger.info("Deactivation");
	}

}
