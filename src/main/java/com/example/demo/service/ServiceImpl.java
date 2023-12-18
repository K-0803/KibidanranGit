package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Database;
import com.example.demo.repository.AppsRepository;

@Service
@Transactional
public class ServiceImpl implements AppsService {
    @Autowired
    AppsRepository repository;

    @Override
    public Iterable<Database> findByFacility(String viewFacility){
        return repository.findByFacility(viewFacility);
    }

    @Override
    public Iterable<Database> findByType(String viewType){
        return repository.findByType(viewType);
    }
    
}
