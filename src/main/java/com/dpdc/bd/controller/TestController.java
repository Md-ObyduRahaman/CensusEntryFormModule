package com.dpdc.bd.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class TestController {
	
	@RequestMapping("/CensusEntryForm")
	public String censusForm(Model model) {
		
		String dataHtml=" <nav class=\"navbar navbar-expand-lg navbar-light bg-light\" th:fragment=\"header\">\r\n"
				+ "                <div class=\"container-fluid\">\r\n"
				+ "\r\n"
				+ "                    <button type=\"button\" id=\"sidebarCollapse\" class=\"navbar-btn\">\r\n"
				+ "                        <span></span>\r\n"
				+ "                        <span></span>\r\n"
				+ "                        <span></span>\r\n"
				+ "                    </button>\r\n"
				+ "                    <button class=\"btn btn-dark d-inline-block d-lg-none ml-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "                        <i class=\"fas fa-align-justify\"></i>\r\n"
				+ "                    </button>\r\n"
				+ "\r\n"
				+ "                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "                        <ul class=\"nav navbar-nav ml-auto\">\r\n"
				+ "                            <li class=\"nav-item active\">\r\n"
				+ "                                <a class=\"nav-link\" href=\"#\">Page</a>\r\n"
				+ "                            </li>\r\n"
				+ "                            <li class=\"nav-item\">\r\n"
				+ "                                <a class=\"nav-link\" href=\"#\">Page</a>\r\n"
				+ "                            </li>\r\n"
				+ "                            <li class=\"nav-item\">\r\n"
				+ "                                <a class=\"nav-link\" href=\"#\">Page</a>\r\n"
				+ "                            </li>\r\n"
				+ "                            <li class=\"nav-item\">\r\n"
				+ "                                <a class=\"nav-link\" href=\"#\">Page</a>\r\n"
				+ "                            </li>\r\n"
				+ "                        </ul>\r\n"
				+ "                    </div>\r\n"
				+ "                </div>\r\n"
				+ "            </nav>";
		model.addAttribute("dataHtml", dataHtml);
		
		return "CensusEntryForm";
	}
	@RequestMapping("/meterDetailsForm")
	public String meterDetails() {
		return"meterDetailsForm";
	}
	@RequestMapping("/distribution")
	public String distribution() {
		
		return"distributionForm";
	}
	@RequestMapping("/test")
	public String test() {
		
		return"fragments/sidebar";
	}
	
	

}
