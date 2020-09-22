package com.provider.my.bc;

import com.provider.my.bs.InforService;
import com.provider.my.inter.IGetInfor;
import com.provider.my.po.UserInfo;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sunlonglong
 * 22:17
 * 境由心生,事在人为
 */
public class HandlerImpl implements IGetInfor {

    @Resource
    private InforService inforService;

    @Override
    public List<UserInfo> getInfo(UserInfo u) {
        UserInfo u1 = new UserInfo();
        return inforService.getInfo(u1);
    }
}
