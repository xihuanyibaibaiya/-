package com.school.service;

import com.school.entity.Admin;
import com.school.entity.Member;

import java.util.List;

public interface AdminService {

    public List<Admin> findAll();

    Admin selectByUserName(String userName);

    boolean insertAdmin(Admin admin);

    boolean deleteBatchAdmin(int[] adminIds);

    Admin selectByPrimaryKey(int id);

    boolean updateByPrimaryKey(Admin admin);
}
