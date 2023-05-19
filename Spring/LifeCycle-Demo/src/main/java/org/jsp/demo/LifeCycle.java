package org.jsp.demo;

public class LifeCycle {
	static {
		System.out.println(" LifeCycle Claas is load");
	}
	{
		System.out.println("LifeCycle Object is created");
	}

	public void hii() {
		System.out.println("hii from LifeCycle");
	}

	public void bye() {
		System.out.println("byee from LifeCycle");
	}
}
