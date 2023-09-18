
package com.apirestdemo.test.repositories;

import com.apirestdemo.test.models.DatosTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface DatosTestRepository extends JpaRepository<DatosTest, Long> {

//    @Query(value="{call bc_apis..sp_test_api()}", nativeQuery = true)
//    ArrayList<DatosTest> listaProcedure();
}
