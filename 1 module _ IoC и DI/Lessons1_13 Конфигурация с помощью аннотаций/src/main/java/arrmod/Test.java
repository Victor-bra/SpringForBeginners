package arrmod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();

        context.close();
    }
}
