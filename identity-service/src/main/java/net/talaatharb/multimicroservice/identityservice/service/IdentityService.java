package net.talaatharb.multimicroservice.identityservice.service;

import net.talaatharb.multimicroservice.identityservice.dto.TokenDto;
import net.talaatharb.multimicroservice.identityservice.dto.TokenRequestDto;

public interface IdentityService {
	
	/**
	 * Get token matching the request
	 * @param tokenRequestDto
	 * @param onBehalfOfHeader
	 * @param authorizationHeader
	 * @return
	 */
	public abstract TokenDto getToken(TokenRequestDto tokenRequestDto, String onBehalfOfHeader, String authorizationHeader);

}
