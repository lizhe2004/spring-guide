package net.huahuaxia.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Created by lizhe on 2016/10/25.
 */
@SpringBootApplication
public class Application   {


    public static void main(String[] args) throws Exception {
        System.out.println("test");
        ApplicationContext ctx = SpringApplication.run(Application.class,args);
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames){
            System.out.println(beanName);
        }
    }
}
