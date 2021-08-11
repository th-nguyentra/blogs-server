package restapi.io.trainingbackend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import restapi.io.trainingbackend.entity.Blog;
import restapi.io.trainingbackend.service.BlogService;

import java.util.List;


@RequestMapping("/blogs")
@RestController
public class BlogController {
    private BlogService blogService;

    @Autowired
    public BlogController(BlogService theBlogService) {
        blogService = theBlogService;
    }
    @GetMapping("")
    public List<Blog> findAll() {
        return blogService.findAll();
    }

    @GetMapping("/{blogId}")
    public Blog getBlog(@PathVariable int blogId) {

        Blog theBlog = blogService.findById(blogId);

        if (theBlog == null) {
            throw new RuntimeException("Blog id not found - " + theBlog);
        }

        return theBlog;
    }
}
