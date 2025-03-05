package com.kob.backend.controller.pk;

/*
* 该类展示前后端不分离的写法
* */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//这一行是导入Spring框架中的 Controller 注解。Spring框架通过注解来简化配置，
// 这里 Controller 是Spring提供的一个注解，
// 通常用于标识一个类是Spring MVC中的控制器（Controller）类。
// 它使得Spring能够自动识别该类作为处理HTTP请求的控制器，并将其纳入Spring的应用上下文中。

@Controller
//表示这个类是一个Spring MVC的控制器（类）。控制器负责处理来自客户端的请求，并返回相应的视图或数据。
@RequestMapping("/pk/")
public class IndexController {

    @RequestMapping("index/")
    public String index(){
        return "pk/index.html";//该函数返回一个html页面（返回形式是字符串类型的url）
    }
    //当前是前后端不分离的写法，每次后端返回一个完整的html页面
    /*
    * 当在浏览器输入http://localhost:8080/pk/index/，
    * 在后端会进入IndexController类分析请求，先定位/pk/,再定位到index/
    *
    * */

}
