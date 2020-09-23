package com.provider.my.dao;

import com.provider.my.po.UserInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sunlonglong
 * 22:49
 * 境由心生,事在人为
 */
@Repository
public class MyDaoSupport extends SqlSessionDaoSupport implements UserInfoMapper{

    @Autowired(required = false)
    @Qualifier("sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }


    @Override
    public int insert(UserInfo record) {
        return this.getSqlSession().insert(record.getClass().getName()+".insert",record);
    }

    @Override
    public <T> List<T> selectAll(T t) {
        return this.getSqlSession().selectList(t.getClass().getName()+".selectAll",t);
    }
}
