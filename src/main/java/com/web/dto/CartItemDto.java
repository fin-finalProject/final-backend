package com.web.dto;

import com.web.domain.CartItem;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CartItemDto {
	private Long count;
	private Long salePrice;
	private String thumbnail;
	private String isbn;
	private String title;
	
	public CartItemDto(CartItem cartItem) {
		this.count = cartItem.getCount();
		this.salePrice = cartItem.getSalePrice();
		this.thumbnail = cartItem.getThumbnail();
		this.isbn = cartItem.getIsbn();
		this.title = cartItem.getTitle();
	}
}
