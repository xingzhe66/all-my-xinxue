package com.consum.test.demo.bs;

import com.consum.test.demo.service.IService;
import com.consum.test.demo.service.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sunlonglong
 * 21:36
 * 境由心生,事在人为
 */
@Component
public class GetBookService {

    @Autowired
    private IService iService;

    public List<UserInfo> getBook(){
        return iService.getUserInfo();
    }
}
