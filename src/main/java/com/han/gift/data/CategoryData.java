package com.han.gift.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.han.gift.model.*;

@Component
public class CategoryData {
	private static final List<Category> categories = Arrays.asList(
				new Category(1, "human"),
				new Category(2, "robot"),
				new Category(3, "object")
			);
	public Category getCategoryById(int id) {
		for(Category category : categories) {
			if(category.getId() == id) {
				return category;
			}
		}
		return null;
	}
	public List<Category> getCategories() {
		return categories;
	}
}
