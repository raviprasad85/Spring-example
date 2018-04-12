package dao;

import java.util.List;


import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;

import model.Student;

public class StudentDaoImp1HT implements StudentDaoInterface {
	private HibernateTemplate ht;
	
    public void setHt(HibernateTemplate ht) {
		this.ht = ht;
		
	}

	@Override
	public int save(Student st) {
		int i=(Integer)ht.save(st);
		// TODO Auto-generated method stub
		return i;
	}

	@Override
	public boolean update(Student st) {
		ht.update(st);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean delete(Student st) {
		ht.delete(st);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Student findbyPk(int pk) {
		Student std=(Student)ht.get(Student.class, pk);
		// TODO Auto-generated method stub
		return std;
	}


	@Override
	public List<Student> findbyAllUsingHQL() {
		//eturn null;
		List<Student> list=(List<Student>) ht.find("from Student");
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public List<Student> findbyAllUsingCriteria() {
		// TODO Auto-generated method stub
		DetachedCriteria dc=DetachedCriteria.forClass(Student.class);
		List<Student> list = (List<Student>) ht.findByCriteria(dc);
		return list;
		//return null;
	}

}
