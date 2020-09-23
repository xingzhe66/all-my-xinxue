package com.provider.my.bs;

import com.provider.my.dao.MyDaoSupport;
import com.provider.my.po.UserInfo;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
