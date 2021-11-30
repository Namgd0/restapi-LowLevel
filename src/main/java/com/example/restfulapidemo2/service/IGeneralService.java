package com.example.restfulapidemo2.service;

import com.example.restfulapidemo2.model.Category;

import java.util.List;
import java.util.Optional;

public interface IGeneralService<T> {
    List<Category> findAll();

    Optional<Category> findById(Long id);

    Category save(Category category);

    void remove(Long id);
}
