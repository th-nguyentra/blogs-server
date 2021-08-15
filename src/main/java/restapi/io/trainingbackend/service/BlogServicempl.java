package restapi.io.trainingbackend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import restapi.io.trainingbackend.entity.Blog;
import restapi.io.trainingbackend.exception.NotFoundException;
import restapi.io.trainingbackend.repository.BlogRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class BlogServicempl implements BlogService{
    private BlogRepository blogRepository;
    @Autowired
    public BlogServicempl(BlogRepository theBlogRepository) {
        this.blogRepository = theBlogRepository;
    }

    @Override
    public Page<Blog> findAll(String keyword,Integer category_id,int page,int limit) {
        if (category_id ==null && keyword != null) {
            return blogRepository.findBlogs(keyword,PageRequest.of(page,limit));
        }
        else if (category_id ==null && keyword == null) {
            return blogRepository.findAll(PageRequest.of(page,limit));
        }
        else {
            if(category_id != 1){
                return blogRepository.filter(category_id,PageRequest.of(page,limit));
            }else {
                return blogRepository.findAll(PageRequest.of(page,limit));
            }
        }
    }

    @Override
    public Page<Blog> filter(int filter,int page,int limit) {
        if (filter !=0) {
            return blogRepository.filter(filter,PageRequest.of(page,limit));
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
