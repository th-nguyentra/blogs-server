package restapi.io.trainingbackend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import restapi.io.trainingbackend.entity.Blog;
import restapi.io.trainingbackend.exception.NotFoundException;
import restapi.io.trainingbackend.repository.BlogRepository;
import java.util.Optional;

@Service
public class BlogServicempl implements BlogService{
    private BlogRepository blogRepository;
    @Autowired
    public BlogServicempl(BlogRepository theBlogRepository) {
        this.blogRepository = theBlogRepository;
    }

    @Override
    public Page<Blog> findAll(String keyword,int page,int limit) {
        if (keyword != null) {
            return blogRepository.findAll(keyword,PageRequest.of(page,limit));
        }
        return blogRepository.findAll(PageRequest.of(page,limit));
    }


    @Override
    public Blog findById(int theId) {
        Optional<Blog> result = blogRepository.findById(theId);
        Blog theBlog= null;
        if (result.isPresent()) {
            theBlog = result.get();
        }
        else {
            throw new NotFoundException("Did not find Blog id-"+theId);
        }
        return theBlog;
    }
    @Override
    public Blog save(Blog theBlog) {
        return blogRepository.save(theBlog);
    }

}
