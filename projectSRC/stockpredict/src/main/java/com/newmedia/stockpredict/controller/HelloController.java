package com.newmedia.stockpredict.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping(path="/predictOne",method=RequestMethod.PUT)
    public String hello(){
        return "predict stock completed";
    }

    @RequestMapping(path = "data/userTrajectoryByTc", method = RequestMethod.GET)
    public String predictStock(){
        return null;
    }
}
