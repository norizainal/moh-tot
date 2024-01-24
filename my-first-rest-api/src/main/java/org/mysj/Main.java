package org.mysj;

import org.mysj.dto.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        var bob = new Patient();
        bob.setPatientNo(1);
        bob.setAge(21);
        bob.setName("Bob");

        System.out.println(bob.getAge());
        System.out.println(bob.getName());
        System.out.println(bob.getPatientNo());
    }
}
