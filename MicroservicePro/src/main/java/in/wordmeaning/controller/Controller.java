package in.wordmeaning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.wordmeaning.model.Category;
import in.wordmeaning.service.CategoryService;

@RestController
public class Controller {
	@Autowired
	CategoryService categoryService;
	
	
	@RequestMapping(value="/category/saveCategory",method=RequestMethod.POST)
	public Category saveCategory(@RequestBody Category category){
		return categoryService.save(category);
	}
	
	@RequestMapping(value="/category/findAll",method=RequestMethod.GET)
	public List<Category> getAllCategories(){
		return categoryService.findAll();
	}
	
	@RequestMapping(value="/category/findById",method=RequestMethod.GET)
	public Category getSpecificCategory(@RequestParam int id){
		return categoryService.findById(id);
	}
	
	@RequestMapping(value="/saveWord/{category}",method=RequestMethod.POST)
	public String save(@PathVariable String category,@RequestParam String word,@RequestParam String description){
		return "Hello your word is "+word+" with description "+description;
	}
}
