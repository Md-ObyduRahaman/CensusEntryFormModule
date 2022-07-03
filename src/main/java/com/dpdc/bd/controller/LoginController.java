package com.dpdc.bd.controller;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dpdc.bd.dao.LoginDAO;
import com.dpdc.bd.model.EMP_USER_MST;

@Controller
public class LoginController {

	@Resource
	LoginDAO dao;

	@GetMapping("/")
	public String loginPage(Model model) {
		EMP_USER_MST login = new EMP_USER_MST();
		model.addAttribute("login", login);
		return "loginPage";
	}

	@PostMapping("/")
	public String checkUserCredential(HttpServletResponse response, Model model, EMP_USER_MST user) {

		EMP_USER_MST user1 = dao.getLogin(user.getUSER_NAME(), user.getUSER_PASSWORD());

		if (user1 != null) {
			if (user1.getUSER_NAME().equals(user.getUSER_NAME())
					&& user1.getUSER_PASSWORD().equals(user.getUSER_PASSWORD())) {

				Cookie cookie = new Cookie("user_name", user1.getUSER_NAME());
				response.addCookie(cookie);

				System.out.println("valid login");

				return "redirect:/CensusEntryForm";
			}

			else {

				return "redirect:/";
			}

		} else {

			/*
			 * User login = new User(); model.addAttribute("login", login);
			 */

			String msg = "User Id Password Missmatch! Login Failed";
			model.addAttribute("msg", msg);
			return "loginPage";
		}

	}

}
