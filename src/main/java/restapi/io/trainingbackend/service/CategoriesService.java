package restapi.io.trainingbackend.service;

import restapi.io.trainingbackend.entity.Categories;

import java.util.List;

public interface CategoriesService {
    public List<Categories> findAll();
}
