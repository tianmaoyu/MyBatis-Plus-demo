package org.eric.mybatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import org.eric.mybatisplusdemo.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {


    default User getById(Long id) {
        User user = this.selectById(id);
        return user;
    }

    default List<User> getByIds(List<Long> ids) {


        List<User> users = this.selectByIds(ids);
        return users;
    }

    default List<User> getByName(String name) {
//        List<User> users = this.selectList(new LambdaQueryWrapper<User>().eq(User::getName, name));
        return new LambdaQueryChainWrapper<>(this)
                .eq(User::getName, name)
                .list();
    }

    default List<User> getByAge(Integer age) {
        return new LambdaQueryChainWrapper<>(this)
                .eq(User::getAge, age)
                .list();
    }
}