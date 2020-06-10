package in.wordmeaning.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.wordmeaning.model.Category;
import in.wordmeaning.repository.CategoryRepository;
import in.wordmeaning.service.CategoryService;
@Service
public class ServiceImpl implements CategoryService {
	@Autowired
	CategoryRepository categoryRepository;
	
	
	@Override
	public Category save(Category category) {
	return	categoryRepository.save(category);
	}
	
	@Override
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	@Override
	public Category findById(int id){
		Optional<Category> category= categoryRepository.findById(id);
		if(category.isPresent()){
			return category.get();
		}
		return null;
	}
}
