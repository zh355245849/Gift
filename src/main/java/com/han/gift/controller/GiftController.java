package com.han.gift.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.han.gift.data.GiftData;
import com.han.gift.model.Gift;

/**
 * Handles requests for the application home page.
 */
@Controller
public class GiftController {
	
	@Autowired
	private GiftData giftData;	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/")
	public String home(Model model) {
		List<Gift> allGifts = giftData.getGifts();
		model.addAttribute("allGifts", allGifts);
		return "home";
	}
	@RequestMapping(value = "/gif/{name}")
	public String gifDetails(@PathVariable("name") String name, ModelMap modelMap) {
		Gift gift = giftData.getByName(name);
		modelMap.put("gif", gift);
		return "gif-details";
	}
}
