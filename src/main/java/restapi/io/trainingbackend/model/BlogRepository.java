package restapi.io.trainingbackend.model;

import org.springframework.data.jpa.repository.JpaRepository;
import restapi.io.trainingbackend.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

    // that's it ... no need to write any code LOL!

}