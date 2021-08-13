package restapi.io.trainingbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restapi.io.trainingbackend.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {

}