package com.example.demo.service.impl;

import com.example.demo.dto.Shoes;
import com.example.demo.entity.ShoesEntity;
import com.example.demo.mapper.ShoesMapper;
import com.example.demo.repository.ShoesRepository;
import com.example.demo.service.ShoesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShoesServiceImpl implements ShoesService {

    private final ShoesMapper mapper;
    private final ShoesRepository repository;

    @Override
    public List<Shoes> getAll() {
        return repository.findAll().stream()
                .map(mapper::map)
                .toList();
    }

    @Override
    public Shoes save(Shoes shoes) {
        final ShoesEntity entity =  mapper.map(shoes);
        return mapper.map(repository.save(entity));
    }
}
