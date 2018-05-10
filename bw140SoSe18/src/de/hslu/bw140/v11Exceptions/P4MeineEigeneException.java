package de.hslu.bw140.v11Exceptions;

public class P4MeineEigeneException
		extends java.lang.ArithmeticException {

	private static final long serialVersionUID = 1L;

	public P4MeineEigeneException(){
		super("Da hat doch echt wieder " +
				"so ein Hanswurst versucht," +
				" durch Null zu teilen!");
	}

	public P4MeineEigeneException(String message){
		super(message);
	}

}
