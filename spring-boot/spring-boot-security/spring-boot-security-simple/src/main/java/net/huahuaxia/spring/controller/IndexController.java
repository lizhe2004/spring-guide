package net.huahuaxia.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lizhe on 2016/10/28.
 */

@RestController
public class IndexController {

    @RequestMapping("/index")
    public String getIndex(){

        return "index";
    }
}
