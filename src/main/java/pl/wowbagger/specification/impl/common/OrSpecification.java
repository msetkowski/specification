package pl.wowbagger.specification.impl.common;

import pl.wowbagger.specification.api.Specification;
import pl.wowbagger.specification.impl.CompositeSpecification;

public class OrSpecification<T> extends CompositeSpecification<T> {

	private Specification<T> leftSide;
	private Specification<T> rightSide;

	public OrSpecification(Specification<T> a, Specification<T> b) {	
		this.leftSide = a;
		this.rightSide = b;
	}

	@Override
	public Boolean isSatisfiedBy(T candidate) {
		return leftSide.isSatisfiedBy(candidate) || rightSide.isSatisfiedBy(candidate);
	}

}
