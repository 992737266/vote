package com.yc.favorite.util;

import static org.junit.Assert.*;

import java.sql.Connection;



import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class MyBatisUtilTest {

	@Test
	public void testGetSession() {
		SqlSession session=MyBatisUtil.getSession();
		Connection con=session.getConnection();
		assertNotNull("数据路连接失败",con);
	}

	@Test
	public void testGetSessionBoolean() {
		SqlSession session=MyBatisUtil.getSession(true);
		Connection con=session.getConnection();
		assertNotNull("数据路连接失败",con);
	}
}
