package com.yc.favorite.service.impl;

import java.util.List;

import com.yc.favorite.entity.Tag;
import com.yc.favorite.mapper.TagMapper;
import com.yc.favorite.service.TagService;
import com.yc.favorite.util.MyBatisUtil;

public class TagServiceImpl implements TagService{
	public TagMapper tagMapper;
	
	public TagServiceImpl(){
		tagMapper=MyBatisUtil.getSession(true).getMapper(TagMapper.class);
	}
	@Override
	public List<Tag> getAll() {
		return tagMapper.getAll();
	}
	@Override
	public int add(Tag tag) {
		return tagMapper.add(tag);
	}

}
