package org.jsp.UsingAutowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component

public class Engine {
public void Start() {
	System.out.println("ENGINE IS STARTED");
}
}
