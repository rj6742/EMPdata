package com.Bikkadit.Dao;

import java.util.List;

import com.Bikkadit.Model.Employee;

public interface DaoInterface {

	public Employee addemployee(Employee employee);
	
	public List<Employee> Addmultiple(List<Employee> employee);
	
	public Employee getbyid(Integer id);
	
	public List<Employee> getall();
	
	public Employee update(Employee employee);
	
	public String updateMultiple(List<Employee> employee);
	
	public Employee login(String name,String pwd);
	
	public void deleteAll();
	
	public void deletebyid(Integer id);
	
	public List<Employee> agelessthan(Integer id);


}
