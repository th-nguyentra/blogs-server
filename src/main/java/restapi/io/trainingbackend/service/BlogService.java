package restapi.io.trainingbackend.service;
import restapi.io.trainingbackend.entity.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Blog findById(int theId);
    Blog save(Blog theBlog);
    List<Blog> search(String keyword);
}
