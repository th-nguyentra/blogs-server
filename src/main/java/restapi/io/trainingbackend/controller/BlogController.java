package restapi.io.trainingbackend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
    public Page<Blog> findAll(
            @RequestParam(value = "search", required = false) String search,
            @RequestParam(value = "page", required = false) int page,
            @RequestParam(value = "limit", required = false) int limit,
            @RequestParam(value = "category_id", required = false) Integer filter
    ) {
        System.out.println("search:"+search+"-page:"+page+"-limit:"+limit+"-filter:"+filter);
        return blogService.findAll(search,filter,page,limit);
    }

//    @GetMapping(params = { "category_id","page","limit"})
//    public Page<Blog> filter(
//            @RequestParam(value = "category_id", required = false) int category_id,
//            @RequestParam(value = "page", required = false) int page,
//            @RequestParam(value = "limit", required = false) int limit
//    ) {
//        return blogService.filter(category_id,page,limit);
//    }

    @GetMapping("/{blogId}")
    public Blog getBlog(@PathVariable int blogId) {
        return blogService.findById(blogId);
    }
    @PostMapping
    public Blog addBlog(@RequestBody Blog theBlog) {
        blogService.save(theBlog);
        return theBlog;
    }

}
