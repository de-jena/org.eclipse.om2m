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
package org.eclipse.om2m.commons.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.eclipse.om2m.commons.constants.DBEntities;
import org.eclipse.om2m.commons.constants.ShortName;

/**
 * Access control policy JPA entity
 *
 */
@Entity(name = DBEntities.ACCESSCONTROLPOLICY_ENTITY)
@Inheritance(strategy = InheritanceType.JOINED)
public class AccessControlPolicyEntity extends AnnounceableSubordinateEntity {
	
	// Database link to selfPrivilege
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, orphanRemoval=true, mappedBy="selfAccessControlPolicy")
	@JoinTable(
			name=DBEntities.ACPACR_SEFPRIVILEGES,
			joinColumns={@JoinColumn(name=DBEntities.ACPID_COLUMN,referencedColumnName=ShortName.RESOURCE_ID)},
			inverseJoinColumns={@JoinColumn(name=DBEntities.ACRID_COLUMN,referencedColumnName=DBEntities.ACCESSCONTROLRULE_ID)}
			)
	protected List<AccessControlRuleEntity> selfPrivileges;

	// Database link to privileges
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, orphanRemoval=true, mappedBy="accessControlPolicy")
	@JoinTable(
			name=DBEntities.ACPACR_PRIVILEGES,
			joinColumns={@JoinColumn(name=DBEntities.ACP_JOIN_ID,referencedColumnName=ShortName.RESOURCE_ID)},
			inverseJoinColumns={@JoinColumn(name=DBEntities.ACRID_COLUMN,referencedColumnName=DBEntities.ACCESSCONTROLRULE_ID)}
			)
	protected List<AccessControlRuleEntity> privileges;
	
	@ManyToMany(fetch=FetchType.LAZY, mappedBy="linkedAccessControlPolicyEntities")
	@JoinTable(
			name=DBEntities.ACP_DAC_JOIN,
			inverseJoinColumns={@JoinColumn(name=DBEntities.DAC_JOINID, referencedColumnName=ShortName.RESOURCE_ID)},
			joinColumns={@JoinColumn(name=DBEntities.ACP_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)}
			)
	protected List<DynamicAuthorizationConsultationEntity> dynamicConsultationAuthorizations;

	// Database link to the owner CSE
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=CSEBaseEntity.class)
	@JoinTable(
			name=DBEntities.CSEBCHILDACP_JOIN,
			inverseJoinColumns={@JoinColumn(name=DBEntities.CSEB_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)},
			joinColumns={@JoinColumn(name=DBEntities.ACP_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)}
			)
	protected CSEBaseEntity parentCse ;

	// Database link to the parent AE
	@ManyToOne
	@JoinTable(
			name = DBEntities.AEACPCHILD_JOIN,
			inverseJoinColumns = { @JoinColumn(name = DBEntities.AE_JOINID, referencedColumnName = ShortName.RESOURCE_ID) }, 
			joinColumns = { @JoinColumn(name = DBEntities.ACP_JOIN_ID, referencedColumnName = ShortName.RESOURCE_ID) }
			)
	protected AeEntity parentAE;

	// Database link to parent Remote Cse
	@ManyToOne(fetch=FetchType.LAZY, targetEntity = RemoteCSEEntity.class)
	@JoinTable(
			name=DBEntities.CSRACPCHILD_JOIN,
			inverseJoinColumns={@JoinColumn(name=DBEntities.CSR_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)},
			joinColumns={@JoinColumn(name=DBEntities.ACP_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)}
			)
	protected RemoteCSEEntity parentCsr;

	@OneToMany(fetch=FetchType.LAZY, cascade={CascadeType.ALL}, targetEntity = SubscriptionEntity.class, mappedBy="parentAcp")
	@JoinTable(
			name=DBEntities.ACPSUB_JOIN,
			inverseJoinColumns={@JoinColumn(name=DBEntities.SUB_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)},
			joinColumns={@JoinColumn(name=DBEntities.ACP_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)}
			)
	protected List<SubscriptionEntity> childSubscriptions;

//	// linked to RegularRessource
//	@ManyToMany(fetch=FetchType.LAZY, targetEntity=RegularResourceEntity.class)
//	@JoinTable(
//			name = DBEntities.REGULARRESOURCE_ACP_JOIN,
//			inverseJoinColumns = { @JoinColumn(name = DBEntities.REGULARRESOURCE_JOINID, referencedColumnName = ShortName.RESOURCE_ID) }, 
//			joinColumns = { @JoinColumn(name = DBEntities.ACP_JOIN_ID, referencedColumnName = ShortName.RESOURCE_ID) }
//			)
//	protected List<RegularResourceEntity> linkedRegularResources;
	
	// Database link to CSE
	@ManyToMany(fetch=FetchType.LAZY, targetEntity=CSEBaseEntity.class)
	@JoinTable(
			name=DBEntities.CSEBACP_JOIN,
			inverseJoinColumns={@JoinColumn(name=DBEntities.CSEB_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)},
			joinColumns={@JoinColumn(name=DBEntities.ACP_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)}
			)
	protected List<CSEBaseEntity> linkedCses;
	
	// Database link to AE
	@ManyToMany
	@JoinTable(
			name = DBEntities.AEACP_JOIN,
			inverseJoinColumns = { @JoinColumn(name = DBEntities.AE_JOINID, referencedColumnName = ShortName.RESOURCE_ID) }, 
			joinColumns = { @JoinColumn(name = DBEntities.ACP_JOIN_ID, referencedColumnName = ShortName.RESOURCE_ID) }
			)
	protected List<AeEntity> linkedAes;

	// Database link to Container
	@ManyToMany
	@JoinTable(
			name = DBEntities.CNTACP_JOIN,
			inverseJoinColumns = { @JoinColumn(name = DBEntities.CNT_JOIN_ID, referencedColumnName = ShortName.RESOURCE_ID) }, 
			joinColumns = { @JoinColumn(name = DBEntities.ACP_JOIN_ID, referencedColumnName = ShortName.RESOURCE_ID) }
			)
	protected List<ContainerEntity> linkedCnts;
	
	// database link to DynamicAuthorizationConsultation
	@ManyToMany
	@JoinTable(
			name=DBEntities.DAC_ACP_JOIN,
			inverseJoinColumns={@JoinColumn(name=DBEntities.DAC_JOINID, referencedColumnName=ShortName.RESOURCE_ID)},
			joinColumns={@JoinColumn(name=DBEntities.ACP_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)}
			)
	protected List<DynamicAuthorizationConsultationEntity> linkedDynamicAuthorizationConsultation;
	
	// Database link to FlexContainer
	@ManyToMany
	@JoinTable(
			name=DBEntities.FCNT_ACP_JOIN,
			inverseJoinColumns={@JoinColumn(name=DBEntities.FCNT_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)},
			joinColumns={@JoinColumn(name=DBEntities.ACP_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)}
			)
	protected List<FlexContainerEntity> linkedFlexCnts;
	
//	@ManyToMany(fetch=FetchType.LAZY, targetEntity = AnnouncedResourceEntity.class)
//	@JoinTable(
//			name=DBEntities.ANNOUNCEDRESOURCE_ACP_JOIN,
//			inverseJoinColumns={@JoinColumn(name=DBEntities.ANNOUNCEDRESOURCE_JOINID, referencedColumnName=ShortName.RESOURCE_ID)},
//			joinColumns={@JoinColumn(name=DBEntities.ACP_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)}
//			)
//	protected List<AnnouncedResourceEntity> linkedAnnouncedResources;
	
	// Database link to FlexContainerAnnc
	@ManyToMany()
	@JoinTable(
			name=DBEntities.FCNTA_ACP_JOIN,
			inverseJoinColumns={@JoinColumn(name=DBEntities.FCNTA_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)},
			joinColumns={@JoinColumn(name=DBEntities.ACP_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)}
			)
	protected List<FlexContainerAnncEntity> linkedFlexCntAs;
	
	// database link to subscription
	@ManyToMany(fetch=FetchType.LAZY, cascade={CascadeType.ALL}, targetEntity = SubscriptionEntity.class)
	@JoinTable(
			name=DBEntities.SUBACP_JOIN,
			inverseJoinColumns={@JoinColumn(name=DBEntities.SUB_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)},
			joinColumns={@JoinColumn(name=DBEntities.ACP_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)}
			)
	protected List<SubscriptionEntity> linkedSubscription;

	@ManyToMany(fetch = FetchType.LAZY, targetEntity = PollingChannelEntity.class)
	@JoinTable(
			name=DBEntities.ACPPCH_JOIN,
			inverseJoinColumns={@JoinColumn(name=DBEntities.PCH_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)},
			joinColumns={@JoinColumn(name=DBEntities.ACP_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)}
			)
	protected List<PollingChannelEntity> linkedPch;
	
	
	@ManyToMany(fetch = FetchType.LAZY, targetEntity = NodeEntity.class)
	@JoinTable(
			name=DBEntities.ACP_NOD_JOIN,
			inverseJoinColumns={@JoinColumn(name=DBEntities.NOD_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)},
			joinColumns={@JoinColumn(name=DBEntities.ACP_JOIN_ID, referencedColumnName=ShortName.RESOURCE_ID)}
			)
	protected List<NodeEntity> linkedNodes;
	
	@ManyToMany(fetch = FetchType.LAZY, targetEntity = AreaNwkInfoEntity.class)
	@JoinTable(
			name = DBEntities.ANI_ACP_JOIN,
			inverseJoinColumns = { @JoinColumn(name = DBEntities.ANI_JOIN_ID, referencedColumnName = ShortName.RESOURCE_ID) }, 
			joinColumns = { @JoinColumn(name = DBEntities.ACP_JOIN_ID, referencedColumnName = ShortName.RESOURCE_ID) }
			)
	protected List<AreaNwkInfoEntity> areaNwkInfoEntities;
	
	@ManyToMany(fetch = FetchType.LAZY, targetEntity = AreaNwkDeviceInfoEntity.class)
	@JoinTable(
			name = DBEntities.ANDI_ACP_JOIN,
			inverseJoinColumns = { @JoinColumn(name = DBEntities.ANDI_JOIN_ID, referencedColumnName = ShortName.RESOURCE_ID) }, 
			joinColumns = { @JoinColumn(name = DBEntities.ACP_JOIN_ID, referencedColumnName = ShortName.RESOURCE_ID) }
			)
	protected List<AreaNwkDeviceInfoEntity> areaNwkDeviceInfoEntities;
	
	@ManyToMany(fetch = FetchType.LAZY, targetEntity = DeviceInfoEntity.class)
	@JoinTable(
			name = DBEntities.DVI_ACP_JOIN,
			inverseJoinColumns = { @JoinColumn(name = DBEntities.DVI_JOIN_ID, referencedColumnName = ShortName.RESOURCE_ID) }, 
			joinColumns = { @JoinColumn(name = DBEntities.ACP_JOIN_ID, referencedColumnName = ShortName.RESOURCE_ID) }
			)
	protected List<DeviceInfoEntity> deviceInfoEntities;

	
	/**
	 * @return the privileges
	 */
	public List<AccessControlRuleEntity> getPrivileges() {
		if (privileges == null){
			privileges = new ArrayList<>();
		}
		return privileges;
	}

	/**
	 * @param privileges the privileges to set
	 */
	public void setPrivileges(List<AccessControlRuleEntity> privileges) {
		this.privileges = privileges;
	}

	/**
	 * @return the selfPrivileges
	 */
	public List<AccessControlRuleEntity> getSelfPrivileges() {
		if (selfPrivileges == null){
			selfPrivileges = new ArrayList<>();
		}
		return selfPrivileges;
	}

	/**
	 * @param selfPrivileges the selfPrivileges to set
	 */
	public void setSelfPrivileges(List<AccessControlRuleEntity> selfPrivileges) {
		this.selfPrivileges = selfPrivileges;
	}

	/**
	 * @return the parentCse
	 */
	public CSEBaseEntity getParentCse() {
		return parentCse;
	}

	/**
	 * @param parentCse the parentCse to set
	 */
	public void setParentCse(CSEBaseEntity parentCse) {
		this.parentCse = parentCse;
	}

	/**
	 * @return the parentAE
	 */
	public AeEntity getParentAE() {
		return parentAE;
	}

	/**
	 * @param parentAE the parentAE to set
	 */
	public void setParentAE(AeEntity parentAE) {
		this.parentAE = parentAE;
	}

	/**
	 * @return the parentCsr
	 */
	public RemoteCSEEntity getParentCsr() {
		return parentCsr;
	}

	/**
	 * @param parentCsr the parentCsr to set
	 */
	public void setParentCsr(RemoteCSEEntity parentCsr) {
		this.parentCsr = parentCsr;
	}

	/**
	 * @return the linkedCse
	 */
	public List<CSEBaseEntity> getLinkedCse() {
		if (this.linkedCses == null) {
			this.linkedCses = new ArrayList<>();
		}
		return linkedCses;
	}

	/**
	 * @param linkedCse the linkedCse to set
	 */
	public void setLinkedCse(List<CSEBaseEntity> linkedCse) {
		this.linkedCses = linkedCse;
	}

	/**
	 * @return the linkedContainer
	 */
	public List<ContainerEntity> getLinkedContainers() {
		if (this.linkedCnts == null) {
			this.linkedCnts = new ArrayList<>();
		}
		return linkedCnts;
	}

	/**
	 * @param linkedContainer the linkedContainer to set
	 */
	public void setLinkedContainer(List<ContainerEntity> linkedContainer) {
		this.linkedCnts = linkedContainer;
	}
	
	/**
	 * @return the linkedFlexContainer
	 */
	public List<FlexContainerEntity> getLinkedFlexContainers() {
		if (this.linkedFlexCnts == null) {
			this.linkedFlexCnts = new ArrayList<>();
		}
		return linkedFlexCnts;
	}

	/**
	 * @param linkedFlexContainer the linkedFlexContainer to set
	 */
	public void setLinkedFlexContainer(List<FlexContainerEntity> linkedFlexContainer) {
		this.linkedFlexCnts = linkedFlexContainer;
	}


	/**
	 * @return the linkedFlexContainerA
	 */
	public List<FlexContainerAnncEntity> getLinkedFlexContainerAs() {
		if (this.linkedFlexCntAs == null) {
			this.linkedFlexCntAs = new ArrayList<>();
		}
		return linkedFlexCntAs;
	}

	/**
	 * @param linkedFlexContainer the linkedFlexContainer to set
	 */
	public void setLinkedFlexContainerA(List<FlexContainerAnncEntity> linkedFlexContainerA) {
		this.linkedFlexCntAs = linkedFlexContainerA;
	}
	
	/**
	 * @return the linkedSubscription
	 */
	public List<SubscriptionEntity> getLinkedSubscription() {
		if (this.linkedSubscription == null) {
			this.linkedSubscription = new ArrayList<>();
		}
		return linkedSubscription;
	}

	/**
	 * @param linkedSubscription the linkedSubscription to set
	 */
	public void setLinkedSubscription(List<SubscriptionEntity> linkedSubscription) {
		this.linkedSubscription = linkedSubscription;
	}

	/**
	 * @return the linkedPch
	 */
	public List<PollingChannelEntity> getLinkedPch() {
		if (this.linkedPch == null) {
			this.linkedPch = new ArrayList<>();
		}
		return linkedPch;
	}

	/**
	 * @param linkedPch the linkedPch to set
	 */
	public void setLinkedPch(List<PollingChannelEntity> linkedPch) {
		this.linkedPch = linkedPch;
	}

	/**
	 * @return the linkedAes
	 */
	public List<AeEntity> getLinkedAes() {
		if (this.linkedAes == null) {
			this.linkedAes = new ArrayList<>();
		}
		return linkedAes;
	}

	/**
	 * @param linkedAes the linkedAes to set
	 */
	public void setLinkedAes(List<AeEntity> linkedAes) {
		this.linkedAes = linkedAes;
	}

	/**
	 * @return the childSubscription
	 */
	public List<SubscriptionEntity> getChildSubscriptions() {
		if (this.childSubscriptions == null) {
			this.childSubscriptions = new ArrayList<>();
		}
		return childSubscriptions;
	}

	/**
	 * @param childSubscription the childSubscription to set
	 */
	public void setChildSubscriptions(List<SubscriptionEntity> childSubscription) {
		this.childSubscriptions = childSubscription;
	}

	/**
	 * @return the linkedNodes
	 */
	public List<NodeEntity> getLinkedNodes() {
		if (this.linkedNodes == null) {
			this.linkedNodes = new ArrayList<>();
		}
		return linkedNodes;
	}

	/**
	 * @param linkedNodes the linkedNodes to set
	 */
	public void setLinkedNodes(List<NodeEntity> linkedNodes) {
		this.linkedNodes = linkedNodes;
	}

	/**
	 * @return the areaNwkInfoEntities
	 */
	public List<AreaNwkInfoEntity> getAreaNwkInfoEntities() {
		if (this.areaNwkInfoEntities == null) {
			this.areaNwkInfoEntities = new ArrayList<>();
		}
		return areaNwkInfoEntities;
	}

	/**
	 * @param areaNwkInfoEntities the areaNwkInfoEntities to set
	 */
	public void setAreaNwkInfoEntities(List<AreaNwkInfoEntity> areaNwkInfoEntities) {
		this.areaNwkInfoEntities = areaNwkInfoEntities;
	}

	/**
	 * @return the areaNwkDeviceInfoEntities
	 */
	public List<AreaNwkDeviceInfoEntity> getAreaNwkDeviceInfoEntities() {
		if (this.areaNwkDeviceInfoEntities == null) {
			this.areaNwkDeviceInfoEntities = new ArrayList<>();
		}
		return areaNwkDeviceInfoEntities;
	}

	/**
	 * @param areaNwkDeviceInfoEntities the areaNwkDeviceInfoEntities to set
	 */
	public void setAreaNwkDeviceInfoEntities(
			List<AreaNwkDeviceInfoEntity> areaNwkDeviceInfoEntities) {
		this.areaNwkDeviceInfoEntities = areaNwkDeviceInfoEntities;
	}

	/**
	 * @return the deviceInfoEntities
	 */
	public List<DeviceInfoEntity> getDeviceInfoEntities() {
		if (this.deviceInfoEntities == null) {
			this.deviceInfoEntities = new ArrayList<>();
		}
		return deviceInfoEntities;
	}

	/**
	 * @param deviceInfoEntities the deviceInfoEntities to set
	 */
	public void setDeviceInfoEntities(List<DeviceInfoEntity> deviceInfoEntities) {
		this.deviceInfoEntities = deviceInfoEntities;
	}

	public List<MgmtObjEntity> getMgmtObjEntities() {
		List<MgmtObjEntity> ret = new ArrayList<MgmtObjEntity>();
		ret.addAll(getAreaNwkInfoEntities());
		ret.addAll(getAreaNwkDeviceInfoEntities());
		ret.addAll(getDeviceInfoEntities());
		return ret;
	}

	public List<DynamicAuthorizationConsultationEntity> getLinkedDynamicAuthorizationConsultation() {
		if (linkedDynamicAuthorizationConsultation == null) {
			linkedDynamicAuthorizationConsultation = new ArrayList<>();
		}
		return linkedDynamicAuthorizationConsultation;
	}

	public void setLinkedDynamicAuthorizationConsultation(
			List<DynamicAuthorizationConsultationEntity> linkedDynamicAuthorizationConsultation) {
		this.linkedDynamicAuthorizationConsultation = linkedDynamicAuthorizationConsultation;
	}

	@Override
	public List<DynamicAuthorizationConsultationEntity> getDynamicAuthorizationConsultations() {
		if (dynamicConsultationAuthorizations == null) {
			dynamicConsultationAuthorizations = new ArrayList<>();
		}
		return dynamicConsultationAuthorizations;
	}
	
	@Override
	public void setDynamicAuthorizationConsultations(List<DynamicAuthorizationConsultationEntity> list) {
		dynamicConsultationAuthorizations = list;
	}

	@Override
	public List<AccessControlPolicyEntity> getAccessControlPolicies() {
		return null;
	}

	@Override
	public void setAccessControlPolicies(
			List<AccessControlPolicyEntity> accessControlPolicies) {
	}
	
}
