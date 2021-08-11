package restapi.io.trainingbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restapi.io.trainingbackend.entity.Blogs;
import restapi.io.trainingbackend.entity.Categories;
import restapi.io.trainingbackend.model.BlogsRepository;
import restapi.io.trainingbackend.model.CategoriesRepository;

import java.util.List;
@Service
public class BlogsServicempl implements BlogsService{
    private BlogsRepository blogsRepository;
    @Autowired
    public BlogsServicempl(BlogsRepository theBlogsRepository) {
        blogsRepository = theBlogsRepository;
    }
    @Override
    public List<Blogs> findAll() {
        return blogsRepository.findAll();
    }

    @Override
    public void save(Blogs theBlogs) {
        blogsRepository.save(theBlogs);
    }
}
