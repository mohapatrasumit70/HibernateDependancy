package org.jsp.Controller;

import javax.persistence.Query;

import org.jsp.dao.UserDao;
import org.jsp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(names = {"u"})
public class UserController {
	@Autowired
    private UserDao dao;
	@RequestMapping(value="/save")
public ModelAndView saveuser(@ModelAttribute User user,ModelAndView view)
{
		view.setViewName("print.jsp");
		view.addObject("msg", "data Is saved"+user.getId());
		user=dao.saveUser(user);
	return view;
}
	@PostMapping(value ="/update")
	public ModelAndView update(@ModelAttribute User user,ModelAndView view)
	{
		user=dao.updateUser(user);
		view.addObject("u",user);
		view.setViewName("update.jsp");
		view.addObject("msg", "You data is updated");
		return view;
	}
	@PostMapping(value ="/login")
	public ModelAndView login(@RequestParam long phone ,@RequestParam String password)
	{
		
		User user=dao.verifyUser(phone, password);
		ModelAndView view = new ModelAndView();
		if(user!=null) {
		view.setViewName("home.jsp");
		view.addObject("u", user);
		return view;
		}
		else {
			view.setViewName("login.jsp");
			view.addObject("msg","Your phone or password is Invalid");
		}
		return view;
	}
	@GetMapping(value="/delete")
	public ModelAndView DeleteUser(@RequestParam int id ,ModelAndView view)
	{
		boolean isDelete=dao.DeleteUser(id);
		if(isDelete)
		{
			view.addObject("msg","Your Data Is delete");
			view.setViewName("login.jsp");
			return view;
		}else {
			view.addObject("msg", "You must be login first");
			view.setViewName("login.jsp");
			return view;
		}
		
		
	}
}
