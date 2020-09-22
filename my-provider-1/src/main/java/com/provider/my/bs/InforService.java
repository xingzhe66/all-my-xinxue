package com.provider.my.bs;

import com.provider.my.dao.MyDaoSupport;
import com.provider.my.po.UserInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sunlonglong
 * 22:25
 * 境由心生,事在人为
 */

@Service
public class InforService {

    @Resource
    private MyDaoSupport myDaoSupport;

    public List<UserInfo> getInfo(UserInfo u){
      return  myDaoSupport.selectAll(u);
    }
}
