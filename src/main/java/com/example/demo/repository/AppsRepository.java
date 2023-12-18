package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Database;

@Repository
public interface AppsRepository extends CrudRepository<Database, Integer>{
    @Query("SELECT * FROM database WHERE type = :viewType ORDER BY id ASC")
    List<Database> findByType(@Param("viewType") String viewType);

    @Query("SELECT * FROM database WHERE facility LIKE '%' || :viewFacility || '%' ORDER BY id ASC")
    List<Database> findByFacility(@Param("viewFacility") String viewFacility);
    
}
