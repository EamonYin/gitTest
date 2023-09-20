package com.example.gittest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/a")
public class testController {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public String getMallProductLstForMLM(@RequestBody String input) {
        return "Hello World!";
    }
}
