package com.school.controller;

import com.school.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zhanglibo
 * @Description :
 * @Date: Create in 10:21 2018/11/24
 * @Modifed by
 */

@Controller
@RequestMapping("/member")
public class MemberController {


    @RequestMapping("/member-list")
    public String memberList(Model model){

        return "/member/member-list";
    }

    @RequestMapping("/member-add")
    public String memberAdd(Model model){

        return "/member/member-add";
    }

}
