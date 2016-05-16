package com.han.gift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.han.gift.data.CategoryData;
import com.han.gift.data.GiftData;
import com.han.gift.model.Category;
import com.han.gift.model.Gift;

@Controller
public class CategoryController {
	@Autowired
	private CategoryData allCategories;
	@Autowired
	private GiftData giftData;
	
	@RequestMapping("/categories")
	public String categoryList(Model model) {
		List<Category> categories = allCategories.getCategories();
		model.addAttribute("categories", categories);
		return "categories";
	}
	@RequestMapping("/category/{id}")
	public String category(@PathVariable int id, Model model) {
		Category c = allCategories.getCategoryById(id);
		model.addAttribute("category", c);
		List<Gift> cates = giftData.getGiftsById(id);
		model.addAttribute("cateGif", cates);
		return "category";
	}
}
