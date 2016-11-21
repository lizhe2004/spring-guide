package net.huahuaxia.spring;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lizhe on 2016/11/21.
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
   public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }
}
