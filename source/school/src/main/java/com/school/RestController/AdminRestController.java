package com.school.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.school.entity.Admin;
import com.school.entity.Member;
import com.school.service.AdminService;
import com.school.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @Author: zhanglibo
 * @Description :
 * @Date: Create in 22:13 2018/11/26
 * @Modifed by
 */

@RestController
@RequestMapping("/adminApi")
public class AdminRestController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/addAdmin.ajax",method = RequestMethod.POST)
    @ResponseBody
    public String addAdmin(String adminName,String password, String phone, String email, Integer adminRole) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Admin admin = new Admin();
        admin.setUserName(adminName);
        admin.setPassword(password);
        admin.setAuthority(adminRole);
        admin.setPhone(phone);
        admin.setEmail(email);
        admin.setCreateDate(new Date());
        adminService.insertAdmin(admin);
        return mapper.writeValueAsString("success");
    }

    @RequestMapping(value = "/deleteBatchAdmin.ajax",method = RequestMethod.POST)
    @ResponseBody
    public String deleteBatchAdmin(int[] ids) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        /*String[] adminIds = ids.split(",");

        int[] deleteIds = new int[adminIds.length];
        for(int i=0;i<adminIds.length;i++){
            deleteIds[i]=Integer.parseInt(adminIds[i]);
        }*/
        adminService.deleteBatchAdmin(ids);
        return mapper.writeValueAsString("success");
    }

    @RequestMapping(value = "/updateAdmin.ajax",method = RequestMethod.POST)
    @ResponseBody
        public String updateAdmin(String adminId,String password, String phone, String email, Integer adminRole) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Admin admin = adminService.selectByPrimaryKey(Integer.valueOf(adminId));
        if(!StringUtils.isEmpty(password)){
            admin.setPassword(password);
        }
        admin.setAuthority(adminRole);
        admin.setPhone(phone);
        admin.setEmail(email);
        admin.setCreateDate(new Date());
        adminService.updateByPrimaryKey(admin);
        return mapper.writeValueAsString("success");
    }

}
