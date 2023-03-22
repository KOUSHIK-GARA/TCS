package com.tcs.app.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class EmailDetails {
	private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;
    public EmailDetails(String recipient, String msgBody, String subject, String attachment) {
		super();
		this.recipient = recipient;
		this.msgBody = msgBody;
		this.subject = subject;
		this.attachment = attachment;
	}
	
}
