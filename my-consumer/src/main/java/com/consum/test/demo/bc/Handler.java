package com.consum.test.demo.bc;

import com.consum.test.demo.IGetBook;
import com.consum.test.demo.bs.GetBookService;
import com.consum.test.demo.service.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sunlonglong
 * 22:24
 * 境由心生,事在人为
 */
@RestController
public class Handler implements IGetBook {

    @Autowired
    private GetBookService getBookService;

    @Override
    @RequestMapping(value=MY_BOOK)
    public List<UserInfo> getBook() {
        return getBookService.getBook();
    }
}
