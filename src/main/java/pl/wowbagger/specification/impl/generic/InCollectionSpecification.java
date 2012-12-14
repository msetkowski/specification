package pl.wowbagger.specification.impl.generic;

import java.util.Collection;

import pl.wowbagger.specification.impl.CompositeSpecification;

public class InCollectionSpecification<T> extends CompositeSpecification<T> {

	private Collection<T> items;	
	
	public InCollectionSpecification(Collection<T> items) {	
		this.items = items;
	}

	@Override
	public Boolean isSatisfiedBy(T candidate) {
		return items.contains(candidate);
	}

}
