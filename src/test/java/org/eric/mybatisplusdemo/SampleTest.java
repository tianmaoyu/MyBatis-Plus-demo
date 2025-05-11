package org.eric.mybatisplusdemo;

import org.eric.mybatisplusdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
public class SampleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        User user1 = new User();
        user1.setName("Eric");
        System.out.println(user1.getName()); // 输出: Eric

        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        User user = userMapper.getById(1L);
        List<User> jacks= userMapper.getByName("Jack");
        Assert.isTrue(5 == userList.size(), "");
        userList.forEach(System.out::println);
    }

}