package arrmod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Dog mydog = context.getBean("dogBean", Dog.class);
        Dog yourdog = context.getBean("dogBean", Dog.class);

        System.out.println(mydog == yourdog);
        System.out.println(mydog);
        System.out.println(yourdog);
        context.close();
    }
}
