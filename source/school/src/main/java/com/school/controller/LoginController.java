package com.school.controller;

import com.school.dao.MemberDao;
import com.school.entity.Admin;
import com.school.entity.Member;
import com.school.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @Author: zhanglibo
 * @Description :
 * @Date: Create in 10:21 2018/11/24
 * @Modifed by
 */

@Controller
@RequestMapping("/login")
public class LoginController {

    @Resource
    private AdminService adminService;

    @RequestMapping("/login")
    public String login(Model model){

        model.addAttribute("admin",new Admin());
        return "login";
    }

    @RequestMapping(value = "/dologin")
    public String dologin(@ModelAttribute Admin loginAdmin, HttpSession session){

        Admin admin = adminService.selectByUserName(loginAdmin.getUserName());
        if(admin == null){
            return "redirect:/login/login";
        }else if(!loginAdmin.getPassword().equals(admin.getPassword())){
            return "redirect:/login/login";
        }else{
            session.setAttribute("user",admin.getUserName());
            return "index";
        }
    }

    @RequestMapping(value = "/logOut")
    public String logOut(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/login/login";
    }
}
