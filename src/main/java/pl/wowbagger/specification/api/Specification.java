package pl.wowbagger.specification.api;

public interface Specification<T> {
	Boolean isSatisfiedBy(T candidate);
	Specification<T> and(Specification<T> item);
	Specification<T> or(Specification<T> item);
	Specification<T> not();
}
