package com.consum.test.demo.bc;

import com.consum.test.demo.IGetBook;
import com.consum.test.demo.bs.GetBookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sunlonglong
 * 22:24
 * 境由心生,事在人为
 */
@RestController
public class Handler implements IGetBook {

    @Resource
    private GetBookService getBookService;

    @Override
    @RequestMapping(value=MY_BOOK)
    public String getBook() {
        return getBookService.getBook();
    }
}
