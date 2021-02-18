package org.mapstruct.issue.nestedfield;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.issue.nestedfield.model.Source;
import org.mapstruct.issue.nestedfield.model.Target;

@Mapper
public abstract class TargetMapper {

	@Mapping(target = "wrapper1.value", source = "source.nested.value1")
	@Mapping(target = "wrapper2.value", source = "source.nested.value2")
	public abstract Target map(Source source);
}
