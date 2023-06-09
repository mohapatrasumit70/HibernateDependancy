package org.jsp.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class CreateTable {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.jdbc.xml");
	JdbcTemplate template = context.getBean(JdbcTemplate.class);
			template.execute("create table user(int id notnull,name varchar(45) notnull,phone bigint notnull,password varchar(45) notnull ,primarykey(id))");
	}
	

}
  