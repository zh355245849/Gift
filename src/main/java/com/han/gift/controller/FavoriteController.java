package com.han.gift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.han.gift.data.GiftData;
import com.han.gift.model.Gift;

@Controller
public class FavoriteController {
	@Autowired
	private GiftData giftData;
	@RequestMapping(value = "/favorites")
	public String favoriteController(Model model) {
		List<Gift> favorGifts = giftData.getByFavorite(true);
		model.addAttribute("gifs", favorGifts);
		System.out.println("length =====" + favorGifts.size());
		return "favorites";
	}
}
