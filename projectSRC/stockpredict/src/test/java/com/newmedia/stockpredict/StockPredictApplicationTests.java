package com.newmedia.stockpredict;

import com.newmedia.stockpredict.model.User;
import com.newmedia.stockpredict.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockPredictApplicationTests {


    @Autowired
    private UserRepository userRepository;


    @Value("${com.newmedia.name}")
    private String name;

    @Value("${com.newmedia.password}")
    private String password;

    @Test
    public void testInsert() throws Exception {
        System.out.println(name + password);
    }



}
