/*******************************************************************************
 * Copyright (c) 2013, 2017 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *    BAREAU Cyrille <cyrille.bareau@orange.com>, 
 *    BONNARDEL Gregory <gbonnardel.ext@orange.com>, 
 *    BOLLE Sebastien <sebastien.bolle@orange.com>.
 *******************************************************************************/
package org.eclipse.om2m.android.dashboard.cse.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ContentInstance {

	private String con;

	public String getCon() {
		return con;
	}

	public void setCon(String con) {
		this.con = con;
	}
	
}
