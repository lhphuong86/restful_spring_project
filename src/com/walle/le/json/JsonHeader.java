/*
 * @(#) JsonHeader.java 2014. 10. 23.
 *
 * Copyright 2014 NHN Entertainment Corp. All rights Reserved.
 * NHN Entertainment PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.walle.le.json;

/**
 * @author hun
 */
public class JsonHeader {
	private boolean isSuccessful = true;
	private int resultCode = 0;
	private String resultMessage = "SUCCESS";

	public JsonHeader() {
	}

	public JsonHeader(boolean isSuccessful, int resultCode, String resultMessage) {
		this.isSuccessful = isSuccessful;
		this.resultCode = resultCode;
		this.resultMessage = resultMessage;
	}

	public boolean getIsSuccessful() {
		return isSuccessful;
	}

	public void setIsSuccessful(boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	@Override
	public String toString() {
		return "JsonHeader{" + "isSuccessful=" + isSuccessful + ", resultCode=" + resultCode
			+ ", resultMessage='" + resultMessage + '\'' + '}';
	}
}
