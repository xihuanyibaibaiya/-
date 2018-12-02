package com.school.dao;

import com.school.entity.Member;

import java.util.List;

public interface MemberDao {

    List<Member> findAll();

    Member selectByUserName(String userName);
}
