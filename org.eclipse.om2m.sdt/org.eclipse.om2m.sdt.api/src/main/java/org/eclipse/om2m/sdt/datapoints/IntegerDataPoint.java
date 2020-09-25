/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.datapoints;

import org.eclipse.om2m.sdt.Identifiers;
import org.eclipse.om2m.sdt.types.DataType;

public abstract class IntegerDataPoint extends ValuedDataPoint<Integer> {

	public IntegerDataPoint(Identifiers name) {
		super(name, DataType.Integer);
	}
	
}
