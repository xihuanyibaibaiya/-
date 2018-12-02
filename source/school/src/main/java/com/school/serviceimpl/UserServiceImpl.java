package com.school.serviceimpl;

import com.school.dao.MemberDao;
import com.school.entity.Member;
import com.school.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements MemberService {

    @Resource
    private MemberDao userDao;

    @Override
    public List<Member> findAllUsers() {
        return userDao.findAll();
    }
}
