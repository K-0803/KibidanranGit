package com.example.demo.service;

import com.example.demo.entity.Database;

public interface AppsService {
    Iterable<Database> findByFacility(String viewFacility);
    Iterable<Database> findByType(String viewType);
    
}
