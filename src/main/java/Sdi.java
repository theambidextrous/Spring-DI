import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev4money.classes.Farmer;

//Spring dependancy injection bean example
public class Sdi {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
		Farmer f = a.getBean("farmer", Farmer.class);
		f.ShowFarmerWealth();
	}
}
