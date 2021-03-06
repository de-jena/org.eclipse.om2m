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
package org.eclipse.om2m.commons.constants;

import java.math.BigInteger;

/**
 * Initializes platform properties
 */
public interface Constants {
	//CseBase resource properties
    /** CSE Type */
    public final String CSE_TYPE = System.getProperty("org.eclipse.om2m.cseType","IN-CSE");
    /** CseBase id. */
    public final String CSE_ID = System.getProperty("org.eclipse.om2m.cseBaseId","in-cse");
    /** CseBase name. */
    public final String CSE_NAME = System.getProperty("org.eclipse.om2m.cseBaseName", "in-name");
   
    /** Default admin access right profile */
    public final String ADMIN_PROFILE_ID = "acp_admin";
    /** Default admin requesting entity. (username/password) */
    public final String ADMIN_REQUESTING_ENTITY = System.getProperty("org.eclipse.om2m.adminRequestingEntity","admin:admin");
    /** Default guest access right profile */
    public final String GUEST_PROFILE_ID = "ACP_GUEST";
    /** Default guest requesting entity. (username/password) */
    public final String GUEST_REQUESTING_ENTITY = System.getProperty("org.eclipse.om2m.guestRequestingEntity","guest:guest");
    /** Default resources expiration time. */
    public final long EXPIRATION_TIME = 999999999;
    //CseBase communication properties
    /** CseBase default communication protocol. */
    public final String CSE_DEFAULT_PROTOCOL = System.getProperty("org.eclipse.om2m.cseBaseProtocol.default","http");
    /** CseBase ip address. */
    public final String CSE_IP = System.getProperty("org.eclipse.om2m.cseBaseAddress","127.0.0.1");
    /** CseBase listening port. */
    public final int CSE_PORT = Integer.parseInt(System.getProperty("org.eclipse.equinox.http.jetty.http.port","8080"));
    /** CseBase coap port. */
    public final int COAP_PORT = Integer.parseInt(System.getProperty("org.eclipse.om2m.coap.port","5684"));
    /** listening context. Not oneM2M compliant */
    @Deprecated
    public final String CSE_CONTEXT = System.getProperty("org.eclipse.om2m.cseBaseContext","/api");
    /** M2M Service Provider identifier */
    public final String M2M_SP_ID = System.getProperty("org.eclipse.om2m.m2mSpId", "om2m.org");
    
    //The following properties are required only for ASN or MN to perform authentication on a remote IN or MN
    /** Connect to the remote CSE (if not IN) */
    public final boolean CSE_AUTHENTICATION = Boolean.valueOf(System.getProperty("org.eclipse.om2m.cseAuthentication", "true"));
    /** Remote Cse Id. (Required only for MN or ASN)*/
    public final String REMOTE_CSE_ID = System.getProperty("org.eclipse.om2m.remoteCseId","in-cse");
    /** Remote Cse ip address. (Required only for MN or ASN)*/
    public final String REMOTE_CSE_IP = System.getProperty("org.eclipse.om2m.remoteCseAddress","127.0.0.1");
    /** Remote Cse listening port. (Required only for MN or ASN)*/
    public final int REMOTE_CSE_PORT = Integer.parseInt(System.getProperty("org.eclipse.om2m.remoteCsePort","8080"));
    /** Remote Cse listening port. (Required only for MN or ASN)*/
    public final int REMOTE_CSE_COAP_PORT = Integer.parseInt(System.getProperty("org.eclipse.om2m.remoteCseCoapPort","5683"));
    /** Remote Cse listening context. */
    public final String REMOTE_CSE_CONTEXT = System.getProperty("org.eclipse.om2m.remoteCseContext","/api");
    /** Remote Cse Name */
    public final String REMOTE_CSE_NAME = System.getProperty("org.eclipse.om2m.remoteCseName", "in-name");
    
    // Default values for container creation
    /** Default ContentInstances collection maximum number of instance. */
    public final BigInteger MAX_NBR_OF_INSTANCES = new BigInteger(System.getProperty("org.eclipse.om2m.maxNrOfInstances","10"));
    /** Default max byte size for a container */
    public final BigInteger MAX_BYTE_SIZE = new BigInteger(System.getProperty("org.eclipse.om2m.maxByteSize", "10000"));
    
    // Regular expressions
    /** Regular expression for ID of resources */
    public final String ID_REGEXPR = "^[A-Za-z0-9_-]*$" ;
	/** Prefix separator for IDs */
	public final String PREFIX_SEPERATOR = System.getProperty("org.eclipse.om2m.resource.idseparator", "-");
	
	// Non blocking supported boolean
	public final boolean NON_BLOCKING_SUPPORTED = Boolean.parseBoolean(System.getProperty("org.eclipse.om2m.nonblocking", "true"));

	public final String SP_RELATIVE_URI_SEPARATOR = "~";
	public final String ABSOLUTE_URI_SEPARATOR = "_";
	
	public final Integer MAX_THREAD_POOL_SIZE = Integer.valueOf(System.getProperty("org.eclipse.om2m.maxThreadPoolSize", "50"));
	
}