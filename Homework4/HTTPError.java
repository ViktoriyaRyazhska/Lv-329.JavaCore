package com.mak_keywa;

public enum HTTPError {
	E400("Bad Request"),
	E401("Unauthorized"),
	E402("Payment Required"),
	E403("Forbidden"),
	E404("Not Found"),
	E405("Method Not Allowed"),
	E406("Not Acceptable"),
	E407("Proxy Authentication Required"),
	E408("Request Timeout");
	private String desc;
	private HTTPError(String desc) {
		this.desc = desc;
	}
	public String getDescription() {return desc;}
}