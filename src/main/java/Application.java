import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.CustomerService;

public class Application {

    public static void main(String[] args){

        //CustomerService customerService = new CustomerServiceImpl();

        ApplicationContext appcontext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService customerService = appcontext.getBean("customerService", CustomerService.class);

        System.out.println(customerService.findAll().get(0).getFirstName());


    }
}
