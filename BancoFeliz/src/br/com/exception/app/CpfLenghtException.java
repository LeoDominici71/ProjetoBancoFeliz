package br.com.exception.app;

public class CpfLenghtException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public CpfLenghtException(String msg) {
		super(msg);
	}

}
