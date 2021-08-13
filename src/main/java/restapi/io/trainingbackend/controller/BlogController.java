package restapi.io.trainingbackend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping
    public List<Blog> findAll() {
        return blogService.findAll();
    }

    @GetMapping("/{blogId}")
    public Blog getBlog(@PathVariable int blogId) {
        return blogService.findById(blogId);
    }
    @PostMapping
    public Blog addBlog(@RequestBody Blog theBlog) {
        blogService.save(theBlog);
        return theBlog;
    }



    @RequestMapping("/")
    public List<Blog> search(@Param("search") String search) {
        return blogService.search(search);
    }

}
