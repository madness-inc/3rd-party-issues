package org.mapstruct.issue.nestedfield.model;

//@lombok.Data
public class Source {

	private Nested nested;

	public Nested getNested() {
		return nested;
	}

	public void setNested(Nested nested) {
		this.nested = nested;
	}

}
