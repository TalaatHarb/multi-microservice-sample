package net.talaatharb.multimicroservice.identityservice.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import net.talaatharb.multimicroservice.identityservice.dto.IdentityServiceConstants;
import net.talaatharb.multimicroservice.identityservice.dto.TokenRequestDto;
import net.talaatharb.multimicroservice.identityservice.service.IdentityServiceImpl;

@AutoConfigureMockMvc
@ContextConfiguration(classes = { IdentityServiceController.class, IdentityServiceImpl.class })
@WebMvcTest
class IdentityServiceControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testGetToken() throws Exception {
		// Arrange
		final TokenRequestDto sampleTokenRequestDto = new TokenRequestDto();
		sampleTokenRequestDto.setClient_id(UUID.randomUUID().toString());
		sampleTokenRequestDto.setClient_secret(UUID.randomUUID().toString());

		final String onBehalfOfHeader = UUID.randomUUID().toString();
		final String autorizationHeader = UUID.randomUUID().toString();

		// Act
		final MvcResult result = mockMvc
				.perform(MockMvcRequestBuilders.post(IdentityServiceConstants.DEFAULT_URL_FOR_TOKEN)
						.contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
						.header(IdentityServiceConstants.AUTHORIZATION_HEADER, autorizationHeader)
						.header(IdentityServiceConstants.ON_BEHALF_OF_HEADER, onBehalfOfHeader)
						.param(IdentityServiceConstants.CLIENT_ID_PARAM, sampleTokenRequestDto.getClient_id())
						.param(IdentityServiceConstants.CLIENT_SECRET_PARAM, sampleTokenRequestDto.getClient_secret())
						.param(IdentityServiceConstants.GRANT_TYPE_PARAM, sampleTokenRequestDto.getGrant_type())
						.param(IdentityServiceConstants.SCOPE_PARAM, sampleTokenRequestDto.getScope())
						.accept(MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isOk()).andReturn();

		// Assert
		assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());
	}

}
