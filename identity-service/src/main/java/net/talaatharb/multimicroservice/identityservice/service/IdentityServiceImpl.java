package net.talaatharb.multimicroservice.identityservice.service;

import org.springframework.stereotype.Service;

import net.talaatharb.multimicroservice.identityservice.dto.TokenDto;
import net.talaatharb.multimicroservice.identityservice.dto.TokenRequestDto;

@Service
public class IdentityServiceImpl implements IdentityService {

	private static final String FAKE_TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";

	@Override
	public TokenDto getToken(TokenRequestDto tokenRequestDto, String onBehalfOfHeader, String authorizationHeader) {
		final TokenDto token = new TokenDto();
		
		token.setAccessToken(FAKE_TOKEN);
		
		return token;
	}

}
