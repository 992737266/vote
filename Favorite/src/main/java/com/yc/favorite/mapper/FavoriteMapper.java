package com.yc.favorite.mapper;

import java.util.List;
import java.util.Map;

import com.yc.favorite.entity.Favorite;

public interface FavoriteMapper {
	List<Favorite> getAll(); //查询全部的网址信息
	List<Favorite> getByType(Map<String, Object> type);//根据类型查询网址信息
	int add(Favorite favorite); //添加网址信息
}
