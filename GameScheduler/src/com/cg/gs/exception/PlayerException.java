package com.cg.gs.exception;

public class PlayerException extends Exception {
	private static final long serialVersionUID = 1L;
	public PlayerException(){
		
	}
	
	public PlayerException(String msg) {
		super(msg);
	}
}
