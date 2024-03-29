package com.example.demo.repository;

import com.example.demo.entity.ShoesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoesRepository extends CrudRepository<ShoesEntity, Long> {

    List<ShoesEntity> findAll();

}
