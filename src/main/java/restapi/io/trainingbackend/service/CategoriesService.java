package restapi.io.trainingbackend.service;

import restapi.io.trainingbackend.entity.Categories;

import java.util.List;

public interface CategoriesService {
    List<Categories> findAll();
    Categories findById(int theId);
    Categories save(Categories theCategories);
}
