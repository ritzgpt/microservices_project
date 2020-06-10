package in.wordmeaning.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import in.wordmeaning.model.Category;
public interface CategoryRepository extends JpaRepository<Category,Integer>{
	//Category save(Category category);
}
