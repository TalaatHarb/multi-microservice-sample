package net.talaatharb.multimicroservice.identityservice.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import net.talaatharb.multimicroservice.identityservice.dto.IdentityServiceConstants;
import net.talaatharb.multimicroservice.identityservice.dto.TokenDto;
import net.talaatharb.multimicroservice.identityservice.dto.TokenRequestDto;

public interface IdentityServiceApi {

	/**
	 * End point for handling receiving the token request and returning the token
	 * 
	 * @param tokenRequestDto Token request in the form of
	 *                        'application/x-www-form-urlencoded' object
	 * @return Token object
	 */
	@PostMapping(path = "", consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE }, produces = {MediaType.APPLICATION_JSON_VALUE})
	public abstract TokenDto getToken(@ModelAttribute TokenRequestDto tokenRequestDto,
			@RequestHeader(name = IdentityServiceConstants.ON_BEHALF_OF_HEADER, required = false) String onBehalfOfHeader,
			@RequestHeader(name = IdentityServiceConstants.AUTHORIZATION_HEADER, required = false) String authorizationHeader);

}
