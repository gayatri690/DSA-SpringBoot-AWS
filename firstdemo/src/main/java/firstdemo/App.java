package firstdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import firstdemo.firstdemo.Alien;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctn=new ClassPathXmlApplicationContext("spring.xml");
		Alien al=(Alien)ctn.getBean("Alien");
		al.code();
    }
}
