package com.apirestdemo.test.repositories;

import com.apirestdemo.test.models.NamesOnly;
import com.apirestdemo.test.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IUSerRepository extends JpaRepository<UserModel, Long> {
    @Query(value="{call db_user..sp_test_nombres()}", nativeQuery = true)
    ArrayList<NamesOnly> nombres();
}

