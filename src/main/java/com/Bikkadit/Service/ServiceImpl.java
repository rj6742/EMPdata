package com.Bikkadit.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Bikkadit.Dao.DaoInterface;
import com.Bikkadit.Model.Employee;

@Service
public class ServiceImpl implements ServiceI{
	
	
	
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
	public List<Employee> updateMultiple(List<Employee> employee) {

		
		List<Employee> updateMultiple = dao.updateMultiple(employee);
		
		return updateMultiple;
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
	public List<Employee> agelessthan(Integer id) {

		List<Employee> agelessthan = dao.agelessthan(id);
		return agelessthan;
	}

	@Override
	public List<Employee> ageGreaterthan(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
