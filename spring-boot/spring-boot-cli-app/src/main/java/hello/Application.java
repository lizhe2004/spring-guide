package hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Created by lizhe on 2016/10/25.
 */
@SpringBootApplication
public class Application implements  CommandLineRunner {

    @Override
    public void run(String... args){
        if( args.length == 0 ){
            System.out.println("no arg");
        }
        for(int i=0; i<args.length;i++)
        System.out.println(args[i]);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class,args);
    }
}
