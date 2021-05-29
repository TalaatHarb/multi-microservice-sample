package net.talaatharb.multimicroservice.invoicingservice.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class DocumentTypeDto {
	/**
	 * Date when the activity of the document type started
	 */
	private Date activeFrom;

	/**
	 * Optional: date when the activity of the document type ends
	 */
	private Date activeTo;

	/**
	 * Description of the document type
	 */
	private String description;

	/**
	 * Array of document type version summary objects
	 */
	private List<DocumentTypeVerionDto> documentTypeVersions = new ArrayList<>();

	/**
	 * Unique identifier of the document type
	 */
	private Long id;

	/**
	 * Unique name of the document type
	 */
	private String name;
}
