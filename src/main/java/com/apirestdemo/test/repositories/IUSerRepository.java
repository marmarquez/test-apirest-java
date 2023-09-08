package com.apirestdemo.test.repositories;

import com.apirestdemo.test.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUSerRepository extends JpaRepository<UserModel, Long> {

}
