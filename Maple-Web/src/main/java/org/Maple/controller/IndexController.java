package org.Maple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
	
    @RequestMapping(value="/index")  
    public String index(HttpSession session, HttpServletRequest request, Model model) {
        return "index.html";
    }


}
