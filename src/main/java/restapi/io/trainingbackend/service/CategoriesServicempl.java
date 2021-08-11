package restapi.io.trainingbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restapi.io.trainingbackend.entity.Blog;
import restapi.io.trainingbackend.entity.Categories;
import restapi.io.trainingbackend.model.BlogRepository;
import restapi.io.trainingbackend.model.CategoriesRepository;

import java.util.List;
@Service
public class CategoriesServicempl implements CategoriesService{
    private CategoriesRepository categoriesRepository;
    @Autowired
    public CategoriesServicempl(CategoriesRepository theCategoriesRepository) {
        categoriesRepository = theCategoriesRepository;
    }
    @Override
    public List<Categories> findAll() {
        return categoriesRepository.findAll();
    }

    @Override
    public void save(Categories theCategories) {
        categoriesRepository.save(theCategories);
    }

}
