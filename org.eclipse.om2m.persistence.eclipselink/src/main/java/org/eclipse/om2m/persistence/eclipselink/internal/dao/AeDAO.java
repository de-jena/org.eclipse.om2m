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

import java.util.List;

import org.eclipse.om2m.commons.entities.AeEntity;
import org.eclipse.om2m.commons.entities.LabelEntity;
import org.eclipse.om2m.persistence.eclipselink.internal.DBTransactionJPAImpl;
import org.eclipse.om2m.persistence.service.DBTransaction;

/**
 * DAo for the AE entity
 *
 */
public class AeDAO extends AbstractDAO<AeEntity> {

	@Override
	public AeEntity find(DBTransaction dbTransaction, Object id) {
		DBTransactionJPAImpl transaction = (DBTransactionJPAImpl) dbTransaction;
		return transaction.getEm().find(AeEntity.class, id);
	}

	@Override
	public void delete(DBTransaction dbTransaction, AeEntity resource) {
		DBTransactionJPAImpl transaction = (DBTransactionJPAImpl) dbTransaction;

		// de-associate labels
		List<LabelEntity> labels = resource.getLabelsEntities();
		for (LabelEntity label : labels) {
			label.getLinkedAe().remove(resource);
		}
		
		if (resource.getParentCse() != null) {
			resource.getParentCse().getAes().remove(resource);
		}
		if (resource.getParentCsr() != null) {
			resource.getParentCsr().getChildAes().remove(resource);
		}
		transaction.getEm().remove(resource);
//		transaction.getEm().getEntityManagerFactory().getCache().evict(CSEBaseEntity.class);
//		transaction.getEm().getEntityManagerFactory().getCache().evict(RemoteCSEEntity.class);
//		transaction.getEm().getEntityManagerFactory().getCache().evict(RemoteCseAnncEntity.class);
	}

	@Override
	public void update(DBTransaction dbTransaction, AeEntity resource) {
		DBTransactionJPAImpl transaction = (DBTransactionJPAImpl) dbTransaction;
		List<LabelEntity> lbls = processLabels(dbTransaction, resource.getLabelsEntities());
		resource.setLabelsEntities(lbls);
		transaction.getEm().merge(resource);
	}

}
