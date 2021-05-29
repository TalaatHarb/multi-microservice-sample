package net.talaatharb.multimicroservice.identityservice.dto;

public class IdentityServiceConstants {

	/**
	 * Authorization optional header
	 */
	public static final String AUTHORIZATION_HEADER = "Authorization";

	/**
	 * Client Id parameter name
	 */
	public static final String CLIENT_ID_PARAM = "client_id";

	/**
	 * Client secret parameter name
	 */
	public static final String CLIENT_SECRET_PARAM = "client_secret";

	/**
	 * Some default scope
	 */
	public static final String DEFAULT_SCOPE = "InvoicingAPI";

	/**
	 * Default URL for getting token
	 */
	public static final String DEFAULT_URL_FOR_TOKEN = "/connect/token";

	/**
	 * Grant type parameter name
	 */
	public static final String GRANT_TYPE_PARAM = "grant_type";

	/**
	 * On behalf of optional custom header
	 */
	public static final String ON_BEHALF_OF_HEADER = "onbehalfof";

	/**
	 * Scope parameter name
	 */
	public static final String SCOPE_PARAM = "scope";

	private IdentityServiceConstants() {
	}

}
