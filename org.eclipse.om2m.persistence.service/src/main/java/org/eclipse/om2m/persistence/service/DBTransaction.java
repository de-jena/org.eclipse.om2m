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
package org.eclipse.om2m.persistence.service;

/**
 * Describes a DataBase transaction with different operations
 */
public interface DBTransaction {

	/** open the transaction */
	public abstract void open();

	/** commit the transaction */
	public abstract void commit();

	/** close the transaction */
	public abstract void close();

	/** clear the transaction */
	public abstract void clear();
	
	/** lock an object */
	public abstract void lock(Object object);
	
	/** unlock an object */
	public abstract void unlock(Object object);
	

}