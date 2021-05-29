package net.talaatharb.multimicroservice.invoicingservice.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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

import net.talaatharb.multimicroservice.invoicingservice.dto.InvoicingServiceConstants;
import net.talaatharb.multimicroservice.invoicingservice.service.InvoicingServiceImpl;

@AutoConfigureMockMvc
@ContextConfiguration(classes = { InvoicingServiceController.class, InvoicingServiceImpl.class })
@WebMvcTest
class InvoicingServiceControllerTest {

	private static final String FAKE_TOKEN = "Bearer eyJ0b2tlbl9pbmZvIjoiZmFrZSJ9";

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testGetDocumentTypes() throws Exception {
		// Arrange
		final String autorizationHeader = FAKE_TOKEN;

		// Act
		final MvcResult result = mockMvc
				.perform(MockMvcRequestBuilders.get(InvoicingServiceConstants.DEFAULT_URL_FOR_GET_DOCUMENT_TYPES)
						.header(InvoicingServiceConstants.AUTHORIZATION_HEADER, autorizationHeader)
						.accept(MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isOk()).andReturn();

		// Assert
		assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());
	}

}
