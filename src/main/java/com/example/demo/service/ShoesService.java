package com.example.demo.service;

import com.example.demo.dto.Shoes;

import java.util.List;

public interface ShoesService {

    List<Shoes> getAll();

    Shoes save(Shoes shoes);

}
