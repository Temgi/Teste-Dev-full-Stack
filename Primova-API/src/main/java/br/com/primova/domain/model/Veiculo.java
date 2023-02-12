package br.com.primova.domain.model;

import java.io.Serializable;

public class Veiculo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Messages messages;
	private Services services;
	
	private boolean feedbackEnabled;
	private Long timestamp;
	
	
	public Messages getMessages() {
		return messages;
	}
	public void setMessages(Messages messages) {
		this.messages = messages;
	}
	public Services getServices() {
		return services;
	}
	public void setServices(Services services) {
		this.services = services;
	}
	public boolean isFeedbackEnabled() {
		return feedbackEnabled;
	}
	public void setFeedbackEnabled(boolean feedbackEnabled) {
		this.feedbackEnabled = feedbackEnabled;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
}