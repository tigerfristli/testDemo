package com.qs.dubbo.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.qs.dubbo.exterfacr.UserService;
import com.qs.dubbo.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户请求处理Controller
 *
 */
@Controller
public class UserController {
	
	/**注入服务提供者userService*/
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/index") 
	public String index (HttpServletRequest request, HttpServletResponse response, Model model) {
		
		List<User> userList = userService.getAllUser();
		model.addAttribute("userList", userList);
		return "index";
	}

	@RequestMapping(value="/api/getUser",method={RequestMethod.POST,RequestMethod.GET}) 
	public String getUser (HttpServletRequest request, HttpServletResponse response, Model model,
			@RequestParam (value="id", required=true) Integer id) {
		
		User user = userService.getUserById(id);
		model.addAttribute("user", user);
		return "updateUser";
	}
	
	@RequestMapping(value="/api/updateUser",method=RequestMethod.POST)  
	public String updateUser (User user) {
		
		userService.updateUser(user);
		return "redirect:/index";
	}
	
	@RequestMapping(value="/api/addUser",method=RequestMethod.POST)
	public String addUser (User user) {
		
		userService.addUser(user);
		return "redirect:/index";
	}
	
	@RequestMapping (value="/api/deleteUser",method={RequestMethod.POST,RequestMethod.GET})
	public String deleteUser (HttpServletRequest request, HttpServletResponse response,
			@RequestParam (value="id", required=true) Integer id) {
		
		userService.deleteUser(id);
		return "redirect:/index";
	}
}
