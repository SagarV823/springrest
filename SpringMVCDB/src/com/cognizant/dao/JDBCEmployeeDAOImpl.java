package com.cognizant.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.Employee;
import com.cognizant.helper.ConnectionManager;
import com.cognizant.helper.Query;

@Repository("jDBCEmployeeDAOImpl")
public class JDBCEmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private ConnectionManager manager;
	@Autowired
	private Query query;
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		Connection connection=manager.openConnection();
		List<Employee> empList=new ArrayList<>();
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(query.getSelectQuery());
			while(resultSet.next()){
				Employee employee=new Employee();
				employee.setEmpId(resultSet.getInt("emp_id"));
				employee.setEmpName(resultSet.getString("emp_name"));
				employee.setEmpSalary(resultSet.getDouble("emp_salary"));
				employee.setEmpDesignation(resultSet.getString("emp_designation"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		manager.closeConnection();
		return empList;
	}

}
