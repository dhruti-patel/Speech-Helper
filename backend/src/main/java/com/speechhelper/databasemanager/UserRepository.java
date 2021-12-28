package com.speechhelper.databasemanager;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface UserRepository extends JpaRepository <UserEntity, Long> {
	
	List<UserEntity> findAll();
	UserEntity findById(long userId);
	UserEntity findByUsername(String username);
	UserEntity findByEmail(String email);
}
