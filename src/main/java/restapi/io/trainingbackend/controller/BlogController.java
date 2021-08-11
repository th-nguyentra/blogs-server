package restapi.io.trainingbackend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restapi.io.trainingbackend.entity.Blog;
import restapi.io.trainingbackend.entity.Categories;
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
    @PostMapping("")
    public Blog addBlog(@RequestBody Blog theBlog) {
        theBlog.setId(0);
        blogService.save(theBlog);
        return theBlog;
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
