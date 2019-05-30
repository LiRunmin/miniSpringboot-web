package com.newmedia.stockpredict.controller;

import com.newmedia.stockpredict.model.User;
import com.newmedia.stockpredict.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api(description = "swagger测试接口DemoController",tags = {"UserController"})
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取所有用户" , notes = "获取所有用户")
    @RequestMapping(value="/query",method=RequestMethod.GET)
    public User testQuery() {
        return userService.selectUserByName("Daisy");
    }


    @ApiOperation(value="插入用户", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value="/insert",method=RequestMethod.GET)
    public List<User> testInsert() {
        logger.info("插入用户logger测试");
        logger.error("controller error级别出错");
        userService.insertService();
        return userService.selectAllUser();
    }


    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
    @RequestMapping(value="/changemoney",method=RequestMethod.GET)
    public List<User> testchangemoney() {
        userService.changemoney();
        return userService.selectAllUser();
    }


    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(path="/delete",method=RequestMethod.GET)
    public String testDelete() {
        userService.deleteService(3);
        return "OK";
    }

}