package net.talaatharb.multimicroservice.invoicingservice.service;

import org.springframework.stereotype.Service;

import net.talaatharb.multimicroservice.invoicingservice.dto.GetDocumentTypesResult;

@Service
public class InvoicingServiceImpl implements InvoicingService{

	@Override
	public GetDocumentTypesResult getDocumentTypes() {
		return new GetDocumentTypesResult();
	}

}
