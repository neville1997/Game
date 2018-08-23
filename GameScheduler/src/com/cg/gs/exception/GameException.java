package com.cg.gs.exception;

public class GameException extends Exception{
	private static final long serialVersionUID = 1L;
	public GameException(){
		
	}
	
	public GameException(String msg) {
		super(msg);
	}
}
