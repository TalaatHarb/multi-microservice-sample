package net.talaatharb.multimicroservice.identityservice.dto;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

class TokenRequestDtoTest {

	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	@Test
	void testJsonNamingWorks() throws IOException {
		final TokenRequestDto sampleTokenRequestDto = new TokenRequestDto();
		final String result = MAPPER.writeValueAsString(sampleTokenRequestDto);
		
		final long numOfUnderScores = result.chars().filter(c-> c != '_').count();
		
		assertTrue(numOfUnderScores >= 3);
	}
}
