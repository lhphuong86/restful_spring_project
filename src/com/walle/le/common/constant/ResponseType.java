package com.walle.le.common.constant;

public enum ResponseType {
	/** success */
	SUCCESS(true, "SUCCESS", 0),
	/**unknown */
	UNKNOWN(false, "UNKNOWN", -5000);
	
	private final boolean isSuccessful;
	private String resultMessage;
	private final int resultCode;

	private ResponseType(boolean isSuccessful, String resultMessage, int resultCode) {
		this.isSuccessful = isSuccessful;
		this.resultMessage = resultMessage;
		this.resultCode = resultCode;
	}

	public boolean getIsSuccessful() {
		return isSuccessful;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public int getResultCode() {
		return resultCode;
	}
}
