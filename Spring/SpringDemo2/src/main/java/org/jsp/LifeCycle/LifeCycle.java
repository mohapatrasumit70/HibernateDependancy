package org.jsp.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle implements InitializingBean,DisposableBean{
	static {
		System.out.println("class is load ");
	}
	{
		System.out.println("non static block is called");
	}
	public LifeCycle()
	{
		System.out.println("constroctor is called");
	}

	public void destroy() throws Exception {
		System.out.println("Destroye method is called");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init is called");
		
	}

}
