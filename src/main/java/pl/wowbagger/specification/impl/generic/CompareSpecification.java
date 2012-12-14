package pl.wowbagger.specification.impl.generic;

import pl.wowbagger.specification.impl.CompositeSpecification;

public class CompareSpecification<T extends Comparable<T>> extends CompositeSpecification<T> {

	private T leftSide;
	private Relation rel;
		
	public CompareSpecification(T a, Relation rel) {
		this.leftSide = a;
		this.rel = rel;
	}

	@Override
	public Boolean isSatisfiedBy(T candidate) {
		Boolean result = false;
		switch(rel){
		case GT: 
			result = leftSide.compareTo(candidate) > 0;
			break;
		case LT:
			result = leftSide.compareTo(candidate) < 0;
			break;
		case GTE: 
			result = leftSide.compareTo(candidate) >= 0;
			break;
		case LTE:
			result = leftSide.compareTo(candidate) <= 0;
			break;
		}		
		return result;
	}

}
