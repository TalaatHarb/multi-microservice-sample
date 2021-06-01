package net.talaatharb.multimicroservice.backend.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.talaatharb.multimicroservice.backend.service.external.InvoicingExternalService;
import net.talaatharb.multimicroservice.invoicingservice.dto.GetDocumentTypesResult;

@RestController
@CrossOrigin
public class ExampleController {

	@Autowired
	private InvoicingExternalService invoicingExternalService;

	@GetMapping(path = "/documentTypes")
	public GetDocumentTypesResult getDocumentTypesResult() {
		return invoicingExternalService.getDocumentTypes("Bearer eyJ0b2tlbl9pbmZvIjoiZmFrZSJ9");
	}

}
