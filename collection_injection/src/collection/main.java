package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
public static void main(String[] args) {
	
	
	ApplicationContext context= new ClassPathXmlApplicationContext("collectioninjec.xml");
	CollectionIn coll=(CollectionIn)context.getBean("dsinjection");
	System.out.println(coll.toString());

}
}

