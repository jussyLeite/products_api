package com.course.springboot.services.implemetation;


import com.course.springboot.models.Category;
import com.course.springboot.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

   public  boolean existCategory(Category category){
       Optional<Category>  categoryFound = this.categoryRepository.findById(category.getId());
        return categoryFound.isEmpty();
    }
    

    public Object criar(Category category){
         if (this.existCategory(category))
           return this.categoryRepository.save(category);
         return new Object();
    }
}
