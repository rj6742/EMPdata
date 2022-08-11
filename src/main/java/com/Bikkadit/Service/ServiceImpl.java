package com.Bikkadit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bikkadit.Dao.DaoInterface;
import com.Bikkadit.Model.Employee;

@Service
public class ServiceImpl implements ServiceI{
	
	
	@Autowired
	private DaoInterface dao;

	@Override
	public Employee addemployee(Employee employee) {

		Employee addemployee = dao.addemployee(employee);
		return addemployee;
	}

	@Override
	public List<Employee> Addmultiple(List<Employee> employee) {

		
		List<Employee> addmultiple = dao.Addmultiple(employee);
		
		return addmultiple;
	}

	@Override
	public Employee getbyid(Integer id) {

		Employee getbyid = dao.getbyid(id);
		
		return getbyid;
	}

	@Override
	public List<Employee> getall() {

		List<Employee> getall = dao.getall();
		
		return getall;
	}

	@Override
	public Employee update(Employee employee) {

		Employee update = dao.update(employee);
		
		return update;
	}

	@Override
	public void updateMultiple(List<Employee> employee) {

		
		dao.updateMultiple(employee);
	
	}

	@Override
	public Employee login(String name, String pwd) {

		Employee login = dao.login(name, pwd);
		
		return login;
	}

	@Override
	public void deleteAll() {
		dao.deleteAll();		
	}

	@Override
	public void deletebyid(Integer id) {

		dao.deletebyid(id);
	}

	@Override
	public List<Employee> agelessthan(Integer age) {

		List<Employee> agelessthan = dao.agelessthan(age);
		return agelessthan;
	}

	

}
