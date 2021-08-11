package restapi.io.trainingbackend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restapi.io.trainingbackend.entity.Blogs;
import restapi.io.trainingbackend.service.BlogsService;

import java.util.List;

@RequestMapping("/blogs")
@RestController
public class BlogsController {
    private BlogsService blogsService;

    @Autowired
    public BlogsController(BlogsService theBlogsService) {
        blogsService = theBlogsService;
    }
    @GetMapping("")
    public List<Blogs> findAll() {
        return blogsService.findAll();
    }
    @PostMapping("")
    public Blogs addBlogs(@RequestBody Blogs theBlogs) {
        theBlogs.setId(0);
        blogsService.save(theBlogs);
        return theBlogs;
    }
}
