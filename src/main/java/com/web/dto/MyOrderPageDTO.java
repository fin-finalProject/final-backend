package com.web.dto;

import java.util.List;

import lombok.Data;

@Data
public class MyOrderPageDTO {
	
	private List<MyOrderDTO> myOrder;
	private Long count; //총 주문 개수
	private int size;// 한 페이지에 보이는 주문 개수
	private int page; // 전체 페이지수

}
