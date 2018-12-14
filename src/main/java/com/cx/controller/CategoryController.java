package com.cx.controller;

import com.cx.entity.Category;
import com.cx.mapper.CategoryMapper;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
@RequestMapping("/cx")
@Log4j
public class CategoryController {
    @Resource(name = "categoryMapper")
    CategoryMapper categoryMapper;

    @RequestMapping("/test")
    @ResponseBody
    public Category test() {
        log.info("haha1");
        return categoryMapper.selectByPrimaryKey(1);
    }

    @RequestMapping("/test2")
    public String test2() {
        return "index";
    }

}
