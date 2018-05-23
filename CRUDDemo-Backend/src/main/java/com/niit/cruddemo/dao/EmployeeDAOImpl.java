package com.niit.cruddemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.cruddemo.model.Employee;

@Repository("employeeDAO")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired //it will create object when required
	private SessionFactory sessionFactory;
	
	public List<Employee> findAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	public Employee findById(int empId) {
		
			return (Employee)sessionFactory.getCurrentSession()
					.createQuery("from Employee where employeeId="+empId)
					.uniqueResult();
	
	}

	public boolean addEmployee(Employee employee) {
		try {
			sessionFactory.getCurrentSession().save(employee);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateEmployee(Employee employee) {
		try {
			sessionFactory.getCurrentSession().update(employee);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteEmployee(int empId) {
		try {
			sessionFactory.getCurrentSession().delete(findById(empId));	
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public Employee findByName(String name) {
		return (Employee)sessionFactory.getCurrentSession()
				.createQuery("from Employee where employeeName='"+name+"'")
				.uniqueResult();
	}

	@Override
	public boolean validateEmployee(String emailid, String password) {
		// TODO Auto-generated method stub
		Query query=sessionFactory.getCurrentSession().createQuery("from employee where employeeMailId='"+emailid+"' and employeePassword='"+password+"'");
		Employee employee=(Employee)query.uniqueResult();
		if(employee!=null)
			return true;
		else
			return false;
	}

}
