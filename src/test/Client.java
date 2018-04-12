package test;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDaoInterface;
import model.Student;

public class Client {
public static void main(String[] args) {
	ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("resources/text.xml");
	StudentDaoInterface dao=(StudentDaoInterface)cap.getBean("dao");
	Student st=new Student();
	st.setId(2117);
	st.setName("mmm678");
	st.setEmail("m@gmail.co6m");
	st.setAddress("cdg");

	dao.save(st);
	
	/*Student st1=dao.findbyPk(1);
	System.out.println(st1.getName());
	System.out.println(st1.getEmail());
	System.out.println(st1.getAddress());*/
	
	/*List<Student> list=dao.findbyAllUsingHQL();
	for(Student st:list){
		System.out.println(st.getEmail());
		System.out.println(st.getAddress());
	}*/
	
	
	/*List<Student> list=dao.findbyAllUsingCriteria();
	 for(Student st:list){
		System.out.println(st.getEmail());
		System.out.println(st.getAddress());
	}
	System.out.println("success");*/
	cap.close();
}
}
