package com.ba.my.myprovider2.bs;

import com.ba.my.myprovider2.dao.MyDaoSupport;
import com.ba.my.myprovider2.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author sunlonglong
 * 22:25
 * 境由心生,事在人为
 */

@Component
public class InforService {

    @Autowired
    private MyDaoSupport myDaoSupport;

    public List<UserInfo> getInfo(UserInfo u){
        myDaoSupport.insert(u);
      return  myDaoSupport.selectAll(u);
    }
}
