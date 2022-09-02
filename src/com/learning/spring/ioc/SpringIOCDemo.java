package com.learning.spring.ioc;

import com.learning.spring.ioc.pojo.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class SpringIOCDemo {

    public static void main(String[] args) {
        System.out.println("---------------Without Spring IOC------------------");

        long start = System.currentTimeMillis();
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Abhi");
        emp.setDept("Dev");

        System.out.println(emp);
        long end = System.currentTimeMillis();
        System.out.println(end-start);


        System.out.println("---------------With Spring IOC------------------");

        start = System.currentTimeMillis();
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        Employee emp1 = (Employee) context.getBean("emp1");

        System.out.println(emp1);
        end = System.currentTimeMillis();
        System.out.println(end-start);

        //Spring IOC COnf setup takes more than 10 times of without IOC time

    }
}
