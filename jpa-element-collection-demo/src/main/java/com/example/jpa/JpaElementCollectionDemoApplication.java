package com.example.jpa;

import java.util.HashSet;
import java.util.Set;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.model.Address;
import com.example.jpa.model.User;
import com.example.jpa.repository.UserRepository;

@SpringBootApplication
public class JpaElementCollectionDemoApplication  implements CommandLineRunner{
	
	
	@Autowired
    DataSource dataSource;

    @Autowired
    UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaElementCollectionDemoApplication.class, args);
	}

	@Transactional(readOnly = true)
    @Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("DATASOURCE = " + dataSource);
		
		Set<String> phoneNumbers = new HashSet<>();
        phoneNumbers.add("+91-9999999999");
        phoneNumbers.add("+91-9898989898");

        Set<Address> addresses = new HashSet<>();
        addresses.add(new Address("747", "Golf View Road", "Bangalore",
                "Karnataka", "India", "560008"));
        addresses.add(new Address("Plot No 44", "Electronic City", "Bangalore",
                "Karnataka", "India", "560001"));

        User user = new User("Rajeev Kumar Singh", "rajeev@callicoder.com",
                phoneNumbers, addresses);

        userRepository.saveAndFlush(user);
		
	}
}
