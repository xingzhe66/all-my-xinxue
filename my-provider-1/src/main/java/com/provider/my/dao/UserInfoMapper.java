package com.provider.my.dao;

import com.provider.my.po.UserInfo;
import java.util.List;

public interface UserInfoMapper {
    int insert(UserInfo record);

   <T> List<T> selectAll(T t);
}