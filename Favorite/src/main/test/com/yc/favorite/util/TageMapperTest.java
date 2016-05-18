package com.yc.favorite.util;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.yc.favorite.entity.Tag;
import com.yc.favorite.mapper.TagMapper;


public class TageMapperTest {

	@Test
	public void testGetAll() {
		SqlSession session=MyBatisUtil.getSession();

		TagMapper tagMapper=session.getMapper(TagMapper.class);

		List<Tag> list=tagMapper.getAll();
		MyBatisUtil.close(session);
		System.out.println(list);
		assertNotNull("查找信息失败!!!",list);
	}

}
