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
package org.eclipse.om2m.persistence.eclipselink.internal.dao;

import org.eclipse.om2m.commons.entities.ContainerAnncEntity;
import org.eclipse.om2m.commons.entities.ContainerEntity;
import org.eclipse.om2m.commons.entities.ContentInstanceEntity;
import org.eclipse.om2m.persistence.eclipselink.internal.DBTransactionJPAImpl;
import org.eclipse.om2m.persistence.service.DBTransaction;

/**
 * DAO for the content instance entity
 *
 */
public class ContentInstanceDAO extends AbstractDAO<ContentInstanceEntity> {

	@Override
	public void create(DBTransaction dbTransaction, ContentInstanceEntity resource) {
		DBTransactionJPAImpl transaction = (DBTransactionJPAImpl) dbTransaction;
		super.create(dbTransaction, resource);
		// evict cache of possible parent entities
		transaction.getEm().getEntityManagerFactory().getCache().evict(ContainerEntity.class);
		transaction.getEm().getEntityManagerFactory().getCache().evict(ContainerAnncEntity.class);
	}
	
	@Override
	public ContentInstanceEntity find(DBTransaction dbTransaction, Object id) {
		DBTransactionJPAImpl transaction = (DBTransactionJPAImpl) dbTransaction;
		return transaction.getEm().find(ContentInstanceEntity.class, id);
	}

	@Override
	public void delete(DBTransaction dbTransaction,	ContentInstanceEntity resource) {
		DBTransactionJPAImpl transaction = (DBTransactionJPAImpl) dbTransaction;
		transaction.getEm().remove(resource);
		// evict cache of possible parent entities
		transaction.getEm().getEntityManagerFactory().getCache().evict(ContainerEntity.class);
		transaction.getEm().getEntityManagerFactory().getCache().evict(ContainerAnncEntity.class);
	}

}
