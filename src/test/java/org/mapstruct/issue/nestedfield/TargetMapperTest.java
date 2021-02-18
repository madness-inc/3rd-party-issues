package org.mapstruct.issue.nestedfield;

import org.junit.Assert;
import org.junit.Test;
import org.mapstruct.issue.nestedfield.model.Nested;
import org.mapstruct.issue.nestedfield.model.Source;
import org.mapstruct.issue.nestedfield.model.Target;

public class TargetMapperTest {

	
	@Test
	public void testMapper() {
		Source source = new Source();
		Nested nested = new Nested();
		nested.setValue1("foo");
		nested.setValue2("bar");
		source.setNested(nested);
		Target target = new TargetMapperImpl().map(source);
		Assert.assertEquals(nested.getValue1(), target.getWrapper1().getValue());
		Assert.assertEquals(nested.getValue2(), target.getWrapper2().getValue());
	}
	
}
