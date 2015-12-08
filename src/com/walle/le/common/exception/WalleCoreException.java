package com.walle.le.common.exception;

import com.walle.le.common.constant.ResponseType;

public class WalleCoreException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final WalleCoreException SUCCESS = new WalleCoreException(ResponseType.SUCCESS);
	
	protected ResponseType responseType = ResponseType.UNKNOWN;

	public WalleCoreException(){

	}

	public WalleCoreException(ResponseType responseType) {
		super(responseType.getResultMessage());
		this.responseType = responseType;
	}
	

	public WalleCoreException(ResponseType responseType, Throwable e) {
		super(responseType.getResultMessage(), e);
		this.responseType = responseType;
	}

	@Override 
	public synchronized Throwable fillInStackTrace() {
		return this;
	}

	public int getResultCode() {
		return responseType.getResultCode();
	}

	public boolean getIsSuccessful() {
		return responseType.getIsSuccessful();
	}

	public String getResultMessage() {
		return responseType.getResultMessage();
	}
}
