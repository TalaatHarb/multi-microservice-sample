package net.talaatharb.multimicroservice.invoicingservice.service;

import net.talaatharb.multimicroservice.invoicingservice.dto.GetDocumentTypesResult;

public interface InvoicingService {
	public abstract GetDocumentTypesResult getDocumentTypes();
}
