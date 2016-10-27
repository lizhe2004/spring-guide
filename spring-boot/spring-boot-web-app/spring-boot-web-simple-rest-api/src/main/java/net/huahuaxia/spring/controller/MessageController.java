package net.huahuaxia.spring.controller;

import net.huahuaxia.spring.entity.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by lizhe on 2016/10/27.
 */
@RestController
public class MessageController {

    private static final String template = "你好，%s！";
    private final AtomicLong counter = new AtomicLong();

    /*   将/welcome-message 的URL的http请求映射到getWelcomeMessage方法
    RequestMapping 中没有声明method 所以会映射到所有的HTTP方法，包括GET、POST、PUT等
    如果想要进行限制，可以使用@RequestMapping(method=GET)
    @RequestParam 会将查询字符串name的值绑定到getWelcomeMessage方法的name参数中。
    查询字符串参数默认是必需的（required=true),在这里，我们显式地将其标记为可选的：
    如果请求中不包含这个参数的话，则用defaultValue
    */
    @RequestMapping("/welcome-message")
    public Message getWelcomeMessage(@RequestParam(value="name",defaultValue="李大爷") String name) {
        return new Message(counter.incrementAndGet(),String.format(template,name));
    }
}
