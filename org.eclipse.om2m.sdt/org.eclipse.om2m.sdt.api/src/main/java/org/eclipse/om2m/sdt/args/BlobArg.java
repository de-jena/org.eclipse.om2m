/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.args;

import org.eclipse.om2m.sdt.types.DataType;

public class BlobArg extends ValuedArg<byte[]> {

	public BlobArg(String name) {
		super(name, DataType.Blob);
	}

//	public void setValue(String v) {
//		setValue(Base64.decodeBase64(v));
//	}
//	
//	public void setValue(byte[] v) {
//		setValue(Base64.encodeBase64(v));
//	}

}
