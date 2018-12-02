package com.school.serviceimpl;

import com.school.dao.AdminDao;
import com.school.dao.MemberDao;
import com.school.entity.Admin;
import com.school.entity.Member;
import com.school.service.AdminService;
import com.school.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminDao adminDao;

    @Override
    public List<Admin> findAll() {

        return adminDao.findAll();
    }

    @Override
    public Admin selectByUserName(String userName) {
        return adminDao.selectByUserName(userName);
    }

    @Override
    public boolean insertAdmin(Admin admin) {

        return adminDao.insertAdmin(admin);
    }

    @Override
    public boolean deleteBatchAdmin(int[] adminIds) {
        return adminDao.deleteBatchAdmin(adminIds);
    }

    @Override
    public Admin selectByPrimaryKey(int id) {
        return adminDao.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKey(Admin admin) {
        return adminDao.updateByPrimaryKey(admin);
    }


}
