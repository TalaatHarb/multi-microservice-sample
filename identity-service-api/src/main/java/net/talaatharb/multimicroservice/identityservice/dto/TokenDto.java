package net.talaatharb.multimicroservice.identityservice.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TokenDto {

	/**
	 * Default expiration time for token is 3600 seconds
	 */
	private static final Long DEFAULT_EXPIRATION_TIME = 3600L;

	/**
	 * Default token type is Bearer token
	 */
	private static final String DEFAULT_TOKEN_TYPE = "Bearer";

	/**
	 * Encoded JWT token structure that contains the fields of the issued token and
	 * also token protection attributes
	 */
	private String accessToken = "";

	/**
	 * The lifetime of the access token defined in seconds
	 */
	private Long expiresIn = DEFAULT_EXPIRATION_TIME;

	/**
	 * Optional if matches the requested scope. Otherwise contains information on
	 * scope granted to token. This defines the APIs that client will have access to
	 * using this token
	 */
	private String scope = IdentityServiceConstants.DEFAULT_SCOPE;

	/**
	 * Token type returned and default is Bearer token
	 */
	private String tokenType = DEFAULT_TOKEN_TYPE;
}
