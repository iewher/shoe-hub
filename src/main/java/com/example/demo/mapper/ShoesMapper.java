package com.example.demo.mapper;

import com.example.demo.dto.Shoes;
import com.example.demo.entity.ShoesEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ShoesMapper {

    Shoes map(ShoesEntity entity);

    ShoesEntity map(Shoes shoes);

}
