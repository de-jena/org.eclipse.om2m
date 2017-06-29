/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.modules;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.om2m.sdt.DataPoint;
import org.eclipse.om2m.sdt.Domain;
import org.eclipse.om2m.sdt.Module;
import org.eclipse.om2m.sdt.datapoints.ArrayDataPoint;
import org.eclipse.om2m.sdt.exceptions.AccessException;
import org.eclipse.om2m.sdt.exceptions.DataPointException;
import org.eclipse.om2m.sdt.home.types.ModuleType;

public class RunMode extends Module {
	
	private ArrayDataPoint<String> operationMode;
	private ArrayDataPoint<String> supportedModes;

	public RunMode(final String name, final Domain domain,
			ArrayDataPoint<String> operationMode,
			ArrayDataPoint<String> supportedModes) {
		super(name, domain, ModuleType.runMode.getDefinition(),
				ModuleType.runMode.getLongDefinitionName(), 
				ModuleType.runMode.getShortDefinitionName());
		
		this.operationMode = operationMode;
		this.operationMode.setDoc("Comma separated list of the currently active mode(s)");
		this.operationMode.setLongDefinitionType("operationMode");
		this.operationMode.setShortDefinitionType("opeMe");
		addDataPoint(this.operationMode);
		
		this.supportedModes = supportedModes;
		this.supportedModes.setDoc("Comma separated list of possible modes the device supports");
		this.supportedModes.setLongDefinitionType("supportedModes");
		this.supportedModes.setShortDefinitionType("supMs");
		addDataPoint(this.supportedModes);
	}
	
	public RunMode(final String name, final Domain domain, Map<String, DataPoint> dps) {
		this(name, domain, 
			(ArrayDataPoint<String>) dps.get("opeMe"),
			(ArrayDataPoint<String>) dps.get("supMs"));
	}

	public List<String> getOperationMode() throws DataPointException, AccessException {
		return operationMode.getValue();
	}

	public void setOperationMode(List<String> v) throws DataPointException, AccessException {
		List<String> modes = getSupportedModes();
		for (String s : v) {
			if (! modes.contains(s)) {
				throw new DataPointException("value " + s + " is not permitted");
			}
		}
		this.operationMode.setValue(v);
	}

	public void setOperationMode(String v) throws DataPointException, AccessException {
		if (! getSupportedModes().contains(v)) {
			throw new DataPointException("value " + v + " is not permitted");
		}
		this.operationMode.setValue(Arrays.asList(v));
	}

	public List<String> getSupportedModes() throws DataPointException, AccessException {
		return supportedModes.getValue();
	}

	public void setSupportedModes(List<String> v) throws DataPointException, AccessException {
		this.supportedModes.setValue(v);
	}

}
