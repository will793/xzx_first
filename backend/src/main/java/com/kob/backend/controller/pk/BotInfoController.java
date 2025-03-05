package com.kob.backend.controller.pk;

/*
* 该类展示前后端分离的写法
* */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {

    @RequestMapping("getBotInfo/")
    public Map<String,String> getBotInfo(){
        Map<String,String> map=new HashMap<>();
        map.put("name","nightmare");
        map.put("rating","1000");
        return map;
    }
}
