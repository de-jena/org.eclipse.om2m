/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.mocked.modules;

import java.util.Date;

import org.eclipse.om2m.sdt.Domain;
import org.eclipse.om2m.sdt.datapoints.DateDataPoint;
import org.eclipse.om2m.sdt.datapoints.TimeDataPoint;
import org.eclipse.om2m.sdt.exceptions.DataPointException;
import org.eclipse.om2m.sdt.home.modules.Clock;
import org.eclipse.om2m.sdt.home.types.DatapointType;

public class MockedClock extends Clock {

	public MockedClock(String name, Domain domain) {
		super(name, domain,
			new TimeDataPoint(DatapointType.currentTime) {
				private Date d = new Date();
				@Override
				public void doSetValue(Date value) throws DataPointException {
					d = value;
				}
				@Override
				public Date doGetValue() throws DataPointException {
					return d;
				}
			}, 
			new DateDataPoint(DatapointType.currentDate) {
				private Date d = new Date();
				@Override
				public void doSetValue(Date value) throws DataPointException {
					d = value;
				}
				@Override
				public Date doGetValue() throws DataPointException {
					return d;
				}
			});
	}

}
