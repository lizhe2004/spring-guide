package net.huahuaxia.spring.net.huahuaxia.spring.web.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by lizhe on 2016/10/26.
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "你好，世界";
    }
}
