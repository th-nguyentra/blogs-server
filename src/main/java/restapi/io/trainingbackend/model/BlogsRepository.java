package restapi.io.trainingbackend.model;

import org.springframework.data.jpa.repository.JpaRepository;
import restapi.io.trainingbackend.entity.Blogs;

public interface BlogsRepository extends JpaRepository<Blogs, Integer> {

}