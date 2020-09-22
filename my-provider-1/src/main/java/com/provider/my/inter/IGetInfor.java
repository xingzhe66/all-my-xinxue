package com.provider.my.inter;

import com.provider.my.po.UserInfo;

import java.util.List;

/**
 * @author sunlonglong
 * 22:16
 * 境由心生,事在人为
 */
public interface IGetInfor {

    public static final String INFO_OF_BOOK = "info/of/book";

    public List<UserInfo> getInfo(UserInfo userInfo);
}
