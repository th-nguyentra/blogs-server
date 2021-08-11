package restapi.io.trainingbackend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import restapi.io.trainingbackend.entity.Categories;
import restapi.io.trainingbackend.service.CategoriesService;

import java.util.List;

@RequestMapping("/categories")
@RestController
public class CategoriesController {
    private CategoriesService categoriesService;

    @Autowired
    public CategoriesController(CategoriesService theCategoriesService) {
        categoriesService = theCategoriesService;
    }
    @GetMapping("")
    public List<Categories> findAll() {
        return categoriesService.findAll();
    }

}
