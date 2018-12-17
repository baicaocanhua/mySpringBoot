package com.maimai.myspringboot;

import com.maimai.myspringboot.until.JDBCTools;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcTest {

    @Test
    public void test01(){

        String sql="insert into  `user` value ('33','maimai2','1111','22',0);";
        JDBCTools.upDate(sql);
    }
}
