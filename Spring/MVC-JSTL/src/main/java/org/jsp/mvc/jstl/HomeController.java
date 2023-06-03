package org.jsp.mvc.jstl;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	@RequestMapping("/test")
	public ModelAndView sum(int n1, int n2) {
		ModelAndView view = new ModelAndView();
		view.addObject("sum", (n1 + n2));
		view.setViewName("SumEvenOrOdd");
		return view;
	}
	@RequestMapping("/EvenOdd")
	public ModelAndView sum(int n1, int n2, int n3, int n4, int n5, int n6) {
		ArrayList<Integer> nums = new ArrayList(Arrays.asList(n1, n2, n3, n4, n5, n6));
		ModelAndView view = new ModelAndView();
		view.setViewName("CheckArrayOddOrEven");
		view.addObject("nums",nums);
		return view;
	}
}
