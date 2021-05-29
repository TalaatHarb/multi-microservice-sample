package net.talaatharb.multimicroservice.invoicingservice.api;

import org.springframework.web.bind.annotation.GetMapping;

import net.talaatharb.multimicroservice.invoicingservice.dto.GetDocumentTypesResult;
import net.talaatharb.multimicroservice.invoicingservice.dto.InvoicingServiceConstants;

public interface InvoicingServiceApi {

	/**
	 * API is REST based API that does not take additional URL parameters, yet it
	 * returns the list of active and deactivated document types that were once
	 * active.
	 * 
	 * @return The resulting structure is part of a single object result that
	 *         includes list of DocumentType elements
	 */
	@GetMapping(path = InvoicingServiceConstants.DEFAULT_URL_FOR_GET_DOCUMENT_TYPES)
	public abstract GetDocumentTypesResult getDocumentTypes();

}
