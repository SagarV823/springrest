package com.cognizant.di;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCProductsDAOImpl {

	ApplicationContext ioc=null;
	public JDBCProductsDAOImpl(){
		ioc=new ClassPathXmlApplicationContext("applicationcontext.xml");
	}
	public List getProducts(){
		ConnectionManager manager=new ConnectionManager();
		Connection connection=manager.openConnection();
		ProductsQuery query=(ProductsQuery)ioc.getBean("productsquery");
		try {
			connection.prepareStatement(query.getSelectProducts());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
