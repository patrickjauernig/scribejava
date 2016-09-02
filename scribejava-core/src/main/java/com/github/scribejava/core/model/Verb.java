package com.github.scribejava.core.model;

/**
 * An enumeration containing the most common HTTP Verbs.
 * 
 */

public class Verb {
	public static Verb GET = new Verb("GET");
	public static Verb POST = new Verb("POST");
	public static Verb PUT = new Verb("PUT");
	public static Verb DELETE = new Verb("DELETE");
	public static Verb HEAD = new Verb("HEAD");
	public static Verb OPTIONS = new Verb("OPTIONS");
	public static Verb TRACE = new Verb("TRACE");
	public static Verb PATCH = new Verb("PATCH");
	private String val;

	public Verb(String val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return this.val;
	}
	
	public String name(){
		return this.val;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Verb && this.val.equals(((Verb) obj).name());
	}
}

