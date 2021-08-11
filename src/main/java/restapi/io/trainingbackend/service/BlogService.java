package restapi.io.trainingbackend.service;

import restapi.io.trainingbackend.entity.Blog;

import java.util.List;

public interface BlogService {
    public List<Blog> findAll();
    public Blog findById(int theId);
}
