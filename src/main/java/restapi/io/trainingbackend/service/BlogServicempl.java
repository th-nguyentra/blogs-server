package restapi.io.trainingbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restapi.io.trainingbackend.entity.Blog;
import org.springframework.transaction.annotation.Transactional;
import restapi.io.trainingbackend.entity.Categories;
import restapi.io.trainingbackend.model.BlogRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServicempl implements BlogService{
    private BlogRepository blogRepository;
    @Autowired
    public BlogServicempl(BlogRepository theBlogRepository) {
        blogRepository = theBlogRepository;
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(int theId) {
        Optional<Blog> result = blogRepository.findById(theId);
        Blog theBlog= null;
        if (result.isPresent()) {
            theBlog = result.get();
        }
        else {
            throw new RuntimeException("Did not find blog id - " + theId);
        }
        return theBlog;
    }
    @Override
    public void save(Blog theBlog) {
        blogRepository.save(theBlog);
    }
}
