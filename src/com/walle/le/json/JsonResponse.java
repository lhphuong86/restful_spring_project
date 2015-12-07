/*
 * @(#) JsonResponse.java 2014. 10. 23.
 *
 * Copyright 2014 NHN Entertainment Corp. All rights Reserved.
 * NHN Entertainment PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.walle.le.json;

/**
 * @author hun.
 */
public class JsonResponse<T> {
	private JsonHeader header = new JsonHeader();
	private T data = null;

	public JsonResponse() {
	}

	public JsonResponse(T data) {
		this.data = data;
	}

	public JsonResponse(JsonHeader header, T data) {
		this.header = header;
		this.data = data;
	}

	public JsonHeader getHeader() {
		return header;
	}

	public void setHeader(JsonHeader header) {
		this.header = header;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "JsonResponse{" + "header=" + header + ", data=" + data + '}';
	}
}