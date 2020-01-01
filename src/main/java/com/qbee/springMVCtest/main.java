package com.qbee.springMVCtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.LoginService;

import java.util.HashMap;
import java.util.Map;

@Controller
public class main {

    @Autowired
    LoginService loginService;

    @RequestMapping(value="/")
    public String index(Model model) {
        model.addAttribute("test", "1234");
        return "index";
    }

    @RequestMapping(value="/json", produces = "application/json")
    @ResponseBody
    public Object json() {
        Map<String, String> m = new HashMap<>();
        m.put("test", "1234");
        return m;
    }

    @RequestMapping(value="/qbee")
    public String qbee(Model model) {
        model.addAttribute("test","안녕하세요 봉다혜입니다.");
        return "index";
    }

    @RequestMapping(value="/index2")
    public String index2(Model model) {

        model.addAttribute("test", "index2로 들어오셨군요");
        return "index2";
    }

    @RequestMapping(value="/cafe")
    public String cafe(Model model) {
        model.addAttribute("name", "봉다혜");
        model.addAttribute("id","qbee");
        return "cafe";
    }
    @RequestMapping(value="/blog")
    public String blog(Model model) {
        model.addAttribute("nickname","방문자");
        model.addAttribute("id","반갑습니다");
        model.addAttribute("name","봉다혜");
       return "blog";
    }
}