package pl.wowbagger.specification.impl.common;

import pl.wowbagger.specification.api.Specification;
import pl.wowbagger.specification.impl.CompositeSpecification;

public class NotSpecification<T> extends CompositeSpecification<T> {

	private Specification<T> specification;

	public NotSpecification(Specification<T> specyfication) {
		this.specification = specyfication;
	}

	@Override
	public Boolean isSatisfiedBy(T candidate) {
		// TODO Auto-generated method stub
		return !specification.isSatisfiedBy(candidate);
	}

}
