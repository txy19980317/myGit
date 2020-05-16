package com.dbs.test.demo01;

import com.dbs.demo01.Classes;
import com.dbs.test.demo01.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

public class Testonetoone {
	
	@Test
	public void testSelect() throws IOException{
		
		SqlSession session = MybatisUtils.getFactory().openSession();
		String statement = "com.dbs.demo01.ClassMapper.getClass";
		Classes c = session.selectOne(statement, 1);
		System.out.println(c);
		session.close();
		
	}
	
	
	

	

}
