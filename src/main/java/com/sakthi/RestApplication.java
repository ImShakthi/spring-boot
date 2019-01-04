package com.sakthi;

import com.sakthi.entities.Customer;
import com.sakthi.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class RestApplication implements CommandLineRunner {

  // https://spring.io/guides/gs/accessing-data-mongodb/
  @Autowired private CustomerRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(RestApplication.class, args);
  }

    @Override
    public void run(String... args) throws Exception {

//      repository.deleteAll();
//
//      // save a couple of customers
//      repository.save(new Customer("Alice", "Smith"));
//      repository.save(new Customer("Bob", "Smith"));
//
//      // fetch all customers
//      System.out.println("Customers found with findAll():");
//      System.out.println("-------------------------------");
//      for (Customer customer : repository.findAll()) {
//        System.out.println(customer);
//      }
//      System.out.println();
//
//      // fetch an individual customer
//      System.out.println("Customer found with findByFirstName('Alice'):");
//      System.out.println("--------------------------------");
//      System.out.println(repository.findByFirstName("Alice"));
//
//      System.out.println("Customers found with findByLastName('Smith'):");
//      System.out.println("--------------------------------");
//      for (Customer customer : repository.findByLastName("Smith")) {
//        System.out.println(customer);
//      }
    }

  //  @Bean
  //  public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
  //    return args -> {
  //      System.out.println("Let's inspect the beans provided by Spring Boot:");
  //
  //      String[] beanNames = ctx.getBeanDefinitionNames();
  //      Arrays.sort(beanNames);
  //      for (String beanName : beanNames) {
  //        System.out.println(beanName);
  //      }
  //    };
  //  }

}
