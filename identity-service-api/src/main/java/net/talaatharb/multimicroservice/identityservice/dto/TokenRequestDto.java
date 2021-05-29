package net.talaatharb.multimicroservice.identityservice.dto;

import lombok.Data;

@Data
public class TokenRequestDto {

	/**
	 * Default grant type for OAuth2 usage and the client credentials flow
	 */
	private static final String DEFAULT_GRANT_TYPE = "client_credentials";

	/**
	 * Client Id for client credentials flow, should be mapped to 'client_id'
	 * property
	 */
	private String client_id = "";

	/**
	 * Client secret for client credentials flow, should be mapped to
	 * 'client_secret' property
	 */
	private String client_secret = "";

	/**
	 * Grant type and its default value is to set client credentials flow
	 */
	private String grant_type = DEFAULT_GRANT_TYPE;

	/**
	 * The scope of the token request, Optional parameter asking for a specific
	 * access scope
	 */
	private String scope = IdentityServiceConstants.DEFAULT_SCOPE;

}
