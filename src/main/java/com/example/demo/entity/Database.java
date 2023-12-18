package com.example.demo.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Database {
    @Id
    private Integer id;
    private String type;
    private String mapurl;
    private String facility;
    private String address;
    private String telephone;
    
}
