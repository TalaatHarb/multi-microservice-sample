package net.talaatharb.multimicroservice.identityservice.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TokenRequestDto {

	/**
	 * Default grant type for OAuth2 usage and the client credentials flow
	 */
	public static final String DEFAULT_GRANT_TYPE = "client_credentials";

	/**
	 * Some default scope
	 */
	public static final String DEFAULT_SCOPE = "InvoicingAPI";

	/**
	 * Client Id for client credentials flow, should be mapped to 'client_id' property
	 */
	private String clientId = "";

	/**
	 * Client secret for client credentials flow, should be mapped to 'client_secret' property
	 */
	private String clientSecret = "";

	/**
	 * Grant type and its default value is to set client credentials flow
	 */
	private String grantType = DEFAULT_GRANT_TYPE;

	/**
	 * The scope of the token request
	 */
	private String scope = DEFAULT_SCOPE;

}
