package com.yc.favorite.service;

import java.util.List;

import com.yc.favorite.entity.Tag;

public interface TagService {
	List<Tag> getAll(); //查询所有的标签信息
	int add(Tag tag); //添加网址类型
}
