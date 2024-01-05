package com.example.demo.controller;

import com.example.demo.dto.Shoes;
import com.example.demo.service.ShoesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shoes")
@RequiredArgsConstructor
public class ShoesController {

    private final ShoesService service;

    @GetMapping("/list")
    public List<Shoes> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Shoes save(@RequestBody Shoes shoes) {
        return service.save(shoes);
    }

}
