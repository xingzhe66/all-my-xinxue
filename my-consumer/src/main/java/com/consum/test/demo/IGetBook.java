package com.consum.test.demo;

import com.consum.test.demo.service.UserInfo;

import java.util.List;

/**
 * @author sunlonglong
 * 22:29
 * 境由心生,事在人为
 */
public interface IGetBook {

    static final String MY_BOOK = "MY/BOOK";
    List<UserInfo> getBook();
}
