package resolvers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.rest.input.PersonInput;
import com.api.rest.model.Person;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import repositories.PersonRepository;

@Component
public class PersonResolver implements GraphQLQueryResolver,GraphQLMutationResolver{
	@Autowired
	private PersonRepository personRepository;
	
	public Collection<Person> findAllPeople(){
		return personRepository.findAll();
	}
	
	public Person savePerson(PersonInput input) {
		 return personRepository.save(new Person(input.getName(), input.getAge(), input.getGender()));
	}

}
