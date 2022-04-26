package com.api.rest.input;

import com.api.rest.model.Gender;

import graphql.schema.GraphQLInputType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonInput implements GraphQLInputType {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	private String name;
	private Integer age;
	private Gender gender;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
