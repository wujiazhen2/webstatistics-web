package com.qworldr.webstatistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by wujiazhen on 2018/3/25.
 */
@Controller
public class PageController {

    @RequestMapping("/{url}")
    public  String toPage(@PathVariable String url){
        return url;
    }
    @RequestMapping("/page/**")
    public  String toPage(HttpServletRequest request){
        String requestURI = request.getRequestURI();
        return requestURI;
    }



}
