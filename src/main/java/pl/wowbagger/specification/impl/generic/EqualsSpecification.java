package pl.wowbagger.specification.impl.generic;

import pl.wowbagger.specification.impl.CompositeSpecification;

public class EqualsSpecification<T> extends CompositeSpecification<T> {

	private T leftSide;	
	
	public EqualsSpecification(T a){
		this.leftSide = a;
	}
	
	@Override
	public Boolean isSatisfiedBy(T candidate) {
		return leftSide.equals(candidate);
	}

}
