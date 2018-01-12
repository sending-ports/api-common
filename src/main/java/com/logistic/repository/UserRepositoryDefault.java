package com.logistic.repository;

import com.logistic.models.User;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UserRepositoryDefault implements UserRepository {
	
	@PersistenceContext	
	private EntityManager entityManager;
	private Logger log = Logger.getLogger(UserRepositoryDefault.class.getName());
	private static String HQLFINDALL = "FROM User as user ORDER BY user.name";
	
	@Override
	public void create(User user) {
		log.info("Persisting an user...");
		entityManager.persist(user);
		log.info("User persisted with success ...");
	}

	@Override
	public User findById(Long id) {
		log.info("Finding an user ...");
		return null;
	}

	@Override
	public void update(User user) {
		
	}

	@Override
	public void delete(Long id) {
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		log.info("Finding an user ...");
		List<User> users = entityManager.createQuery(HQLFINDALL).getResultList();
		log.info("Users found with success ...");
		return users;
	}

}