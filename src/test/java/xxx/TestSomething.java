package xxx;

import ooo.Animal;
import ooo.Bird;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.annotation.Resource;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath*:/*.xml"})
//@ContextConfiguration(classes = Animal.class)
public class TestSomething {
    @Autowired
    public Animal a;

    @Autowired
    public Bird b;

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Animal.class);
        for (String s : context.getBeanDefinitionNames()) {
            System.out.println(s);
        }
        //a.hahaha();
        //context.close();
        //System.out.println(a);
        //System.out.println(b);
    }
}
