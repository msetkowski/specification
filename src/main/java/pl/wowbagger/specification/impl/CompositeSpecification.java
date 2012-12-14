package pl.wowbagger.specification.impl;

import pl.wowbagger.specification.api.Specification;
import pl.wowbagger.specification.impl.common.AndSpecification;
import pl.wowbagger.specification.impl.common.NotSpecification;
import pl.wowbagger.specification.impl.common.OrSpecification;

public abstract class CompositeSpecification<T> implements Specification<T> {

	public abstract Boolean isSatisfiedBy(T candidate);

	public Specification<T> and(Specification<T> item) {
		
		return new AndSpecification<T>(this, item);
	}

	public Specification<T> or(Specification<T> item) {
		return new OrSpecification<T>(this, item);
	}

	public Specification<T> not() {
		return new NotSpecification<T>(this);
	}

}
