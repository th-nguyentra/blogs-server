package restapi.io.trainingbackend.service;

import restapi.io.trainingbackend.entity.Blog;
import restapi.io.trainingbackend.entity.Blogs;

import java.util.List;

public interface BlogsService {
    public List<Blogs> findAll();
    public void save(Blogs theBlog);
}
