package com.spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.hibernate.dao.StudentDao;
import com.spring.hibernate.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
       ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
       Student student=new Student(2324,"Manoj","Panipat");
       
       int r=studentDao.insert(student);
       System.out.println("done "+r);
       
    }
}
