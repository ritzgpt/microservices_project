package in.wordmeaning.service;

import java.util.List;

import in.wordmeaning.model.Category;

public interface CategoryService {
	public Category save(Category category);
	public List<Category> findAll();
	public Category findById(int id);
}
