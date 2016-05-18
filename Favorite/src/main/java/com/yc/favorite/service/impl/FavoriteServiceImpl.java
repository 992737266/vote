package com.yc.favorite.service.impl;

import java.util.List;
import java.util.Map;

import com.yc.favorite.entity.Favorite;
import com.yc.favorite.mapper.FavoriteMapper;
import com.yc.favorite.service.FavoriteService;
import com.yc.favorite.util.MyBatisUtil;

public class FavoriteServiceImpl implements FavoriteService {
	public FavoriteMapper favoriteMapper;
	
	public FavoriteServiceImpl(){
		favoriteMapper=MyBatisUtil.getSession(true).getMapper(FavoriteMapper.class);
	}
	@Override
	public List<Favorite> getAll() {
		return favoriteMapper.getAll();
	}

	@Override
	public List<Favorite> getByType(Map<String, Object> type) {
		return favoriteMapper.getByType(type);
	}
	@Override
	public int add(Favorite favorite) {
		return favoriteMapper.add(favorite);
	}

}
