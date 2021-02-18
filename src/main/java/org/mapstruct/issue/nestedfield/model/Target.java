package org.mapstruct.issue.nestedfield.model;

//@lombok.Data
public class Target {

	private Wrapper wrapper1;
	private Wrapper wrapper2;

	public Wrapper getWrapper1() {
		return wrapper1;
	}

	public void setWrapper1(Wrapper wrapper1) {
		this.wrapper1 = wrapper1;
	}

	public Wrapper getWrapper2() {
		return wrapper2;
	}

	public void setWrapper2(Wrapper wrapper2) {
		this.wrapper2 = wrapper2;
	}

}
