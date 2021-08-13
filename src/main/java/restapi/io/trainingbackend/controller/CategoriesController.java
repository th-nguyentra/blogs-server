package restapi.io.trainingbackend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restapi.io.trainingbackend.entity.Blog;
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
    @GetMapping
    public List<Categories> findAll() {
        return categoriesService.findAll();
    }
    @GetMapping("/{categoriesId}")
    public Categories getCategories(@PathVariable int CategoriesId) {

        Categories theCategories = categoriesService.findById(CategoriesId);

        if (theCategories == null) {
            throw new RuntimeException("Categories id not found - " + theCategories);
        }

        return theCategories;
    }
    @PostMapping
    public Categories addCategories(@RequestBody Categories theCategories) {
        theCategories.setId(0);
        categoriesService.save(theCategories);
        return theCategories;
    }
}
