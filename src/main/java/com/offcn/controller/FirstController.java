package com.offcn.controller;

import com.offcn.pojo.User;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class FirstController {

    @RequestMapping("/hello")
    public String hello(Model model){
        String message = "你好，thymeleaf";
        model.addAttribute("message",message);
        return "index";
    }

    @RequestMapping("/getUser")
    public String getUser(Model model){
        User user = new User(0001,"小花",18);
        model.addAttribute("user",user);
        return "getUser";
    }

    @RequestMapping("/getMap")
    public String getMap(Model model){
        Map map = new HashMap();
        map.put("id",222);
        map.put("name","黑黑");
        map.put("age",18);
        model.addAttribute("map",map);
        return "getMap";
    }

    @RequestMapping("/getList")
    public String getList(Model model){
        List<User> list = new ArrayList<>();
        list.add(new User(10000,"二狗",18));
        list.add(new User(10001,"二狗zi",18));
        list.add(new User(10002,"二狗er",18));
        model.addAttribute("list",list);
        return "getList";
    }

    @RequestMapping("/getString")
    public String getString(Model model){
        model.addAttribute("user","heihei");
        model.addAttribute("href","http://www.baidu.com");
        return "getString";
    }

    @RequestMapping("/showIf")
    public String showIf(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("user","user");
        model.addAttribute("manager","manager");
        return "showIf";
    }

    @RequestMapping("/showHead")
    public String showHead(Model model){
        return "showHead";
    }

    @RequestMapping("/showFunc")
    public String showFunc(Model model){
        Date date = new Date();
        model.addAttribute("date",date);

        Double price = 123.456789;
        model.addAttribute("price",price);

        String str = "nǐ hǎo，打招呼的敬语，作为一般对话的开场白、常用语。这也是个最基本的汉语词语。主要用于打招呼请教别人问题前的时候，或者单纯表示礼貌的时候等。\n" +
                "中文名你好外文名hello拼    音nǐ hǎo释    义打招呼的敬语适用场合打招呼或请教别人问题前时适宜人群任何人俄    文Привет法    文Bonjour阿拉伯文مرحبا希伯来文שלום注    音ㄋㄧˇ ㄏㄠˇ";
        model.addAttribute("str",str);
        return "showFunc";
    }













}
