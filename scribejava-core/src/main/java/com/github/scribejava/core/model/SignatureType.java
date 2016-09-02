package com.github.scribejava.core.model;

public class SignatureType {
	public static SignatureType Header = new SignatureType("Header");
	public static SignatureType QueryString = new SignatureType("QueryString");
	private String val;

	public SignatureType(String val) {
		this.val = val;
	}
	
	public String getVal() {
		return this.val;
	}

	@Override
	public String toString() {
		return this.val;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof SignatureType && this.val.equals(((SignatureType) obj).getVal());
	}
}