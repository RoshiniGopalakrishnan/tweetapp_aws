package com.tweetapp.repo;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.tweetapp.entities.TweetsEntity;

@EnableScan
public interface TweetsRepo extends CrudRepository<TweetsEntity, String> {

	List<TweetsEntity> findByUserName(String userName);

	void deleteByTweetId(Long tweetId);

	TweetsEntity findByTweetId(Long tweetId);

	TweetsEntity findTopByOrderByTweetIdDesc();

}
