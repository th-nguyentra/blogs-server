package restapi.io.trainingbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restapi.io.trainingbackend.entity.Blog;
import restapi.io.trainingbackend.entity.Categories;
import restapi.io.trainingbackend.exception.NotFoundException;
import restapi.io.trainingbackend.repository.BlogRepository;
import restapi.io.trainingbackend.repository.CategoriesRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesServicempl implements CategoriesService{
    private CategoriesRepository categoriesRepository;
    @Autowired
    public CategoriesServicempl(CategoriesRepository theCategoriesRepository) {
        this.categoriesRepository = theCategoriesRepository;
    }
    @Override
    public List<Categories> findAll() {
        return categoriesRepository.findAll();
    }

    @Override
    public Categories findById(int theId) {
        Optional<Categories> result = categoriesRepository.findById(theId);
        Categories theCategories= null;
        if (result.isPresent()) {
            theCategories = result.get();
        }
        else {
            throw new NotFoundException("Did not find Categories id-"+theId);
        }
        return theCategories;
    }
    @Override
    public Categories save(Categories theCategories) {
        return categoriesRepository.save(theCategories);
    }
}
