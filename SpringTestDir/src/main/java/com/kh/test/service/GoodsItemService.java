package com.kh.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.test.dto.GoodsItem;
import com.kh.test.mapper.GoodsItemMapper;

@Service
public class GoodsItemService {
	@Autowired
	private GoodsItemMapper goodsItemMapper;

	/*
	 * @Autowired는 아래와 같은 표현을 가지고 있음 public GoodItemService (GoodsItemMapper
	 * goodsItemMapper) { this.goodsItemMapper = goodsItemMapper; }
	 */
	public boolean existsByName(String itemName) {
			Integer count = goodsItemMapper.existByName(itemName);
	        return count > 0;
	}
	/*
	public boolean existsByName(String itemName) {
		//Integer로 맞춘 후 Integer를 boolean으로 변경해서 전달할 예정
		//Integer count = goodsItemMapper.existByName(itemName); -> resultMap 사용방식
		Integer count = goodsItemMapper.existsByName(itemName); //resultMap 사용한 방식
		System.out.println("count : " + count);
		//Integer totalCount = 참인지 거짓인지 ? true이고 null이 아닐 때 : false null = 0 
		Integer totalCount = count != null ? count.getItemCount() : 0;
		return totalCount != null && totalCount > 0; // true라고 전달할 예정 return = boolean
		//Type mismatch : cannot convert from Integer to boolean
		//Mapper에서는 Integer을 작성하고, service 엣
	}
	*/
}
