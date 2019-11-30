package com.pd.service.Impl;

import com.pd.dao.UserDao;
import com.pd.domain.UserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pd.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    //依赖注入
    @Autowired
    UserDao userDao;
    @Autowired
    UserDomain userDomain;

    public String register(String user_name, int user_scores, String user_subject) {
        //一个简单的控制
        if (user_name.equals(" ") || user_subject.equals(" ") || user_scores < 0)
            return "请输入正确的格式";
        else {
            userDomain.setUser_name(user_name);
            userDomain.setUser_scores(user_scores);
            userDomain.setUser_subject(user_subject);
            //调用userdao执行sql语句
            userDao.register(userDomain);
            return "添加成功";
        }
    }
}
