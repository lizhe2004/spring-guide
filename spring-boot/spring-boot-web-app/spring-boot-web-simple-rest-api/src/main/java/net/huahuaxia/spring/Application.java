package net.huahuaxia.spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Created by lizhe on 2016/10/27.
 */
/*
* @SpringBootApplication 是一个非常方便简洁的注解，他提供了如下的功能：
* @Configuration 为application context将一个class标记为bean定义的来源
* @EnableAutoConfiguration 告诉Spring Boot开始根据classpath设置、其他的bean和各种property配置来添加bean
* 通常，我们也会为一个Spring MVC app添加@EnableWebMvc，但是如果Spring Boot在classpath中发现了spring-mvc，它会自动添加这个注解。
*它会将这个应用标记为web应用，进而激活像DispatcherServlet这样的关键行为。
* @ComponentScan 告诉Spring来在net.huahuaxia.spring的包中查找其他的component、configuration、service，来以此找到MessageController
*/
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
