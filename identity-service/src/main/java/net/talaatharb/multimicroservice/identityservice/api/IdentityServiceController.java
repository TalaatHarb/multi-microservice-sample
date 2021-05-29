package net.talaatharb.multimicroservice.identityservice.api;

import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.talaatharb.multimicroservice.identityservice.dto.IdentityServiceConstants;
import net.talaatharb.multimicroservice.identityservice.dto.TokenDto;
import net.talaatharb.multimicroservice.identityservice.dto.TokenRequestDto;
import net.talaatharb.multimicroservice.identityservice.service.IdentityService;

@RestController
@RequestMapping(IdentityServiceConstants.DEFAULT_URL_FOR_TOKEN)
public class IdentityServiceController implements IdentityServiceApi{
	
	private final IdentityService identityService;

	public IdentityServiceController(IdentityService identityService) {
		this.identityService = identityService;
	}

	@Override
	public TokenDto getToken(TokenRequestDto tokenRequestDto, String onBehalfOfHeader, String authorizationHeader) {
		Assert.state(!("".equals(tokenRequestDto.getClient_id())), "Invalid client_id");
		Assert.state(!("".equals(tokenRequestDto.getClient_secret())), "Invalid client_secret");
		Assert.state(!("".equals(tokenRequestDto.getGrant_type())), "Invalid grant_type");
		
		return identityService.getToken(tokenRequestDto, onBehalfOfHeader, authorizationHeader);
	}

}
