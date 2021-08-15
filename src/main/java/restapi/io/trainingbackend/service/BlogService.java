package restapi.io.trainingbackend.service;
import org.springframework.data.domain.Page;
import restapi.io.trainingbackend.entity.Blog;

import java.util.List;

public interface BlogService {
    Blog findById(int theId);
    Blog save(Blog theBlog);
    Page<Blog> findAll(String keyword,int page,int limit);
    List<Blog> filter(int filter);
}
