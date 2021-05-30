package net.talaatharb.multimicroservice.invoicingservice.api;

import org.springframework.web.bind.annotation.RestController;

import net.talaatharb.multimicroservice.invoicingservice.dto.GetDocumentTypesResult;
import net.talaatharb.multimicroservice.invoicingservice.service.InvoicingService;

@RestController
public class InvoicingServiceController implements InvoicingServiceApi {

	private final InvoicingService invoicingService;

	public InvoicingServiceController(InvoicingService invoicingService) {
		this.invoicingService = invoicingService;
	}

	@Override
	public GetDocumentTypesResult getDocumentTypes(String authorizationHeader) {
		return invoicingService.getDocumentTypes();
	}

}
