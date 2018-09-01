package com.ulrich.matthiae.spring.clouddemo.user;

import com.ulrich.matthiae.spring.clouddemo.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
