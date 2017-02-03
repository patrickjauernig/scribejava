package com.github.scribejava.core.model;

/**
 * An enumeration containing the most common HTTP Verbs.
 * 
 */

public class Verb {
	public static Verb GET = new Verb("GET", false);
	public static Verb POST = new Verb("POST", true);
	public static Verb PUT = new Verb("PUT", true);
	public static Verb DELETE = new Verb("DELETE", true);
	public static Verb HEAD = new Verb("HEAD", false);
	public static Verb OPTIONS = new Verb("OPTIONS", false);
	public static Verb TRACE = new Verb("TRACE", false);
	public static Verb PATCH = new Verb("PATCH", true);
	private final boolean permitBody;
	private String key;

	public Verb(String key, boolean permitBody) {
		this.key = key;
		this.permitBody = permitBody;
	}

	@Override
	public String toString() {
		return this.key;
	}
	
	public String name(){
		return this.key;
	}
	
	public boolean isPermitBody() {
        return permitBody;
    }
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Verb && this.key.equals(((Verb) obj).name());
	}
}

