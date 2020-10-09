package com.ba.my.myprovider2.bc;

import com.ba.my.myprovider2.bs.InforService;
import com.ba.my.myprovider2.inter.IGetInfor;
import com.ba.my.myprovider2.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sunlonglong
 * 22:17
 * 境由心生,事在人为
 */
@RestController
public class HandlerImpl implements IGetInfor {

    @Autowired
    private InforService inforService;

    @Override
    @RequestMapping(value = "info/of/book")
    public List<UserInfo> getInfo(UserInfo u) {
        UserInfo u1 = new UserInfo();
        u1.setAddress("土耳其");
        u1.setAge(12);
        u1.setName("特朗普");
        System.out.println("my-provider-2====执行");
        return inforService.getInfo(u1);
    }
}
