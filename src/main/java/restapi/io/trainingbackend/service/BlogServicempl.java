package restapi.io.trainingbackend.service;

import javassist.NotFoundException;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import restapi.io.trainingbackend.entity.Blog;
import org.springframework.transaction.annotation.Transactional;
import restapi.io.trainingbackend.repository.BlogRepository;

import java.io.NotActiveException;
import java.util.List;
import java.util.Optional;

@Service
public class BlogServicempl implements BlogService{
    private BlogRepository blogRepository;
    @Autowired
    public BlogServicempl(BlogRepository theBlogRepository) {
        this.blogRepository = theBlogRepository;
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @SneakyThrows
    @Override
    public Blog findById(int theId) {
        Optional<Blog> result = blogRepository.findById(theId);
        Blog theBlog= null;
        if (result.isPresent()) {
            theBlog = result.get();
        }
        else {
            throw new NotFoundException("Did not find blog id - " + theId);
        }
        return theBlog;
    }
    @Override
    public Blog save(Blog theBlog) {
        return blogRepository.save(theBlog);
    }


    @Override
    public List<Blog> search(String keyword) {
        if (keyword != null) {
            return blogRepository.search(keyword);
        }
        return blogRepository.findAll();
    }
}
