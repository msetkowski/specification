package pl.wowbagger.specification;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import pl.wowbagger.specification.api.Specification;
import pl.wowbagger.specification.impl.CompositeSpecification;
import pl.wowbagger.specification.impl.generic.CompareSpecification;
import pl.wowbagger.specification.impl.generic.EqualsSpecification;
import pl.wowbagger.specification.impl.generic.InCollectionSpecification;
import pl.wowbagger.specification.impl.generic.Relation;

public class SpecificationTest {

	private class User{
		String value ="value";
		Long age = 44L;
		boolean valid = false;
	}
	private class UserSpecification extends CompositeSpecification{
		User user;
		public UserSpecification(User user){
			this.user = user;
		}
		
		@Override
		public Boolean isSatisfiedBy(Object candidate) {
			return user.valid;
		}
		
	}
	
	@Test
	public void test() {
		User user = new User();
		List<User> items = new ArrayList<User>();
		items.add(user);
		Specification<User> spec = new EqualsSpecification<User>(user)				
				.and(new UserSpecification(user).not())
				.and(new InCollectionSpecification<User>(items));
		assertTrue(spec.isSatisfiedBy(user));
	}

}
