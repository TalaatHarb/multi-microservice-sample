package net.talaatharb.multimicroservice.commons.messages;

public class IdentityServiceMessages {
	
	private IdentityServiceMessages() {
	}
	
	public static final String INVALID_CLIENT_ID_KEY = "messages.identityservice.invalid.client_id";
	public static final String INVALID_CLIENT_ID_MESSAGE = "Invalid client_id";
	
	public static final String INVALID_CLIENT_SECRET_KEY = "messages.identityservice.invalid.client_secret";
	public static final String INVALID_CLIENT_SECRET_MESSAGE = "Invalid client_secret";
	
	public static final String INVALID_GRANT_TYPE_KEY = "messages.identityservice.invalid.granty_type";
	public static final String INVALID_GRANT_TYPE_MESSAGE = "Invalid grant_type";

}
