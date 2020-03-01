package mvc_test;

import mvc_test.config.SpringConfig;
import mvc_test.service.TestBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String... args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String output = context.getBean(TestBean.class).getName();
        System.out.println("Hello World! " + output);
    }
}
