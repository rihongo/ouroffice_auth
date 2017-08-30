package com.key.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by rihongo on 2017-08-29.
 */
@Data
@Entity
public class Member {

	@Id
	@GeneratedValue
	Long id;

	String name;

	String username;

	public Member(){}
	public Member(String name, String username ){
		this.name = name;
		this.username = username;
	}

}
