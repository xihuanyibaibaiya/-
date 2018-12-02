package com.school.RestController;

import com.school.entity.Member;
import com.school.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zhanglibo
 * @Description :
 * @Date: Create in 22:13 2018/11/26
 * @Modifed by
 */

@RestController
@RequestMapping("/userApi")
public class MemberRestController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/addMember.ajax",method = RequestMethod.GET)
    @ResponseBody
    public String memberList(){

        List<Member> users = memberService.findAllUsers();
        return "success";
    }
}
