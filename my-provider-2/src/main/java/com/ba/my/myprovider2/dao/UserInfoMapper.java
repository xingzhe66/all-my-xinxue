package com.ba.my.myprovider2.dao;

import com.ba.my.myprovider2.po.UserInfo;

import java.util.List;

public interface UserInfoMapper {
    int insert(UserInfo record);

    <T> List<T> selectAll(T t);
}