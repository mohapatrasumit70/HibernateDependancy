package org.jsp.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class logoutController {
	@RequestMapping("/logout")
public ModelAndView logout(HttpSession session) {
	session.invalidate();
	ModelAndView view = new ModelAndView();
	view.addObject("msg","you are logout");
	view.setViewName("login.jsp");
	return view;
}
}
