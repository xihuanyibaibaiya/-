package com.school.controller;

import com.school.entity.Admin;
import com.school.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: zhanglibo
 * @Description :
 * @Date: Create in 10:21 2018/11/24
 * @Modifed by
 */

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @RequestMapping("/admin-list")
    public String adminList(Model model){

        List<Admin> adminList  = adminService.findAll();
        model.addAttribute("adminList",adminList);
        return "/admin/admin-list";
    }

    @RequestMapping("/admin-add")
    public String adminAdd(Model model){
        return "/admin/admin-add";
    }

    @RequestMapping("/admin-update")
    public String adminUpdate(Model model,Integer id){
        Admin admin = adminService.selectByPrimaryKey(id);
        model.addAttribute("admin",admin);
        return "/admin/admin-update";
    }

}
