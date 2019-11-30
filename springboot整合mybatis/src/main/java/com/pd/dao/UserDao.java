package com.pd.dao;

import com.pd.domain.UserDomain;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    void register(UserDomain userDomain);
}
