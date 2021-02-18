package org.mapstruct.issue.nestedfield.model;

//@lombok.Data
public class Wrapper {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
