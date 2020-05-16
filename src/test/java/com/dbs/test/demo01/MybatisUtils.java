package com.dbs.test.demo01;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	
		public static SqlSessionFactory getFactory() throws IOException{
			String resource = "mybatis-config.xml";

			Reader reader = Resources.getResourceAsReader(resource);

			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			
			
			return sessionFactory;
			
			
		}

}
