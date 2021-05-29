package net.talaatharb.multimicroservice.invoicingservice.dto;

import java.util.Date;

import lombok.Data;

@Data
public class DocumentTypeVerionDto {
	/**
	 * Date when the activity of the document type version started
	 */
	private Date activeFrom;

	/**
	 * Optional: date when the activity of the document type version sends/when it
	 * was deactivated
	 */
	private Date activeTo;

	/**
	 * Description of the document type version
	 */
	private String description;

	/**
	 * Unique identifier of the document type version
	 */
	private Long id;

	/**
	 * Name of the document type version within the document type
	 */
	private String name;

	/**
	 * Status of the document type version - “published”, “deactivated”
	 */
	private String status;

	/**
	 * Unique version number of the document type version
	 */
	private Double versionNumber;
}
