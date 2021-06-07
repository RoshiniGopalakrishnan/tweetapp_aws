package com.tweetapp.repo;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tweetapp.entities.UsersEntity;

@EnableScan
public interface UsersRepo extends CrudRepository<UsersEntity, String> {

	UsersEntity findByLoginId(String loginId);

	List<UsersEntity> searchByIds(String username);

	List<UsersEntity> findAllLoggedInAsTrue();

}
