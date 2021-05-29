package net.talaatharb.multimicroservice.invoicingservice.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class GetDocumentTypesResult {

	/**
	 * a single object result that includes list of DocumentType elements
	 */
	private List<DocumentTypeDto> result = new ArrayList<>();

}
