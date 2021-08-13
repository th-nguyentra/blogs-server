package restapi.io.trainingbackend.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import restapi.io.trainingbackend.entity.Blog;

import java.util.List;
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    @Query("SELECT p FROM blogs p WHERE CONCAT(p.title, p.description,p.description_detail) LIKE %?1%")
    List<Blog> search(String keyword);
}
