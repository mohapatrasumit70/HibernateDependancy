package org.jsp.UsingAutowired;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan("org.jsp.UsingAutowired")
@Configuration
public class ConfirugationEmployee {
	@Bean
public List<Integer> getList(){
	return new LinkedList<Integer>();
}
	@Bean
public Set<String> getSet(){
	return new HashSet<String>();
}

}
