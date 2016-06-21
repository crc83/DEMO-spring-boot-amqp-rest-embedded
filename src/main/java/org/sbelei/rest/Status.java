package org.sbelei.rest;

public class Status {

	private String status;

	//we need defaul constructor in order to run test deserialization
	public Status() {
		//nop
	}

	public Status(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
