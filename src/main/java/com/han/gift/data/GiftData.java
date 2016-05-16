package com.han.gift.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

import com.han.gift.model.Category;
import com.han.gift.model.Gift;

@Component
public class GiftData {
	private static final List<Gift> gifts = Arrays.asList(
			  new Gift(2, "android-explosion", LocalDate.of(2015,2,13), false, "Chris Ramacciotti"),
			  new Gift(1, "ben-and-mike", LocalDate.of(2015,10,30), true, "Ben Jakuben"),
			  new Gift(3, "book-dominos", LocalDate.of(2015,9,15), false, "Craig Dennis"),
			  new Gift(2, "compiler-bot", LocalDate.of(2015,2,13), true, "Ada Lovelace"),
			  new Gift(1, "cowboy-coder", LocalDate.of(2015,2,13), false, "Grace Hopper"),
			  new Gift(1, "infinite-andrew", LocalDate.of(2015,8,23), true, "Marissa Mayer")
			);
	public Gift getByName(String name) {
		for(Gift gift : gifts) {
			if(gift.getName().equals(name))
				return gift;
		}
		return null;
	}
	public List<Gift> getGifts() {
		return gifts;
	}
	public List<Gift> getGiftsById(int id) {
		// TODO Auto-generated method stub
		List<Gift> cateGift = new ArrayList<Gift>();
		for(Gift gift : gifts) {
			if(gift.getCategoryId() == id) {
				cateGift.add(gift);
			}
		}
		return cateGift;
	}
	public List<Gift> getByFavorite(boolean favor) {
		List<Gift> favors = new ArrayList<Gift>();
		System.out.println("222223333333333");
		for(Gift gift : gifts) {
			if(gift.isFavorite()) {
				System.out.println("111111111111");
				favors.add(gift);
			}
		}
		return favors;
	}
}
