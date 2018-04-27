package com.kinghorse.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.kinghorse.spring.entities.Person;

@Repository
public class PersonDao {

	//	��λ�ȡ�͵�ǰ���������EntityManager����ͨ��@PersistenceContextע������ǳ�Ա����
	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Person person){
		entityManager.persist(person);
	}
}
