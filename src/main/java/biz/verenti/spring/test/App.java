package biz.verenti.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App extends Person {

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("src\\main\\java\\biz\\verenti\\spring\\test\\beans\\beans.xml");

        Address address = (Address) context.getBean("address");
        System.out.println(address);

        Person person1 = (Person)context.getBean("person");
        Person person2 = (Person)context.getBean("person");

        person1.setTaxId(666);


        System.out.println(person2);

        ((FileSystemXmlApplicationContext)context).close();
    }
}
