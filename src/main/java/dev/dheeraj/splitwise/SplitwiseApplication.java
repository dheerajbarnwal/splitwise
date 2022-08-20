package dev.dheeraj.splitwise;

import dev.dheeraj.splitwise.controllers.UserController;
import dev.dheeraj.splitwise.dtos.UserCreateRequestDto;
import dev.dheeraj.splitwise.dtos.UserUpdateRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SplitwiseApplication implements CommandLineRunner {

    @Autowired
    UserController userController;

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        UserCreateRequestDto userCreateRequestDto = new UserCreateRequestDto();
        userCreateRequestDto.setName("Dheeraj");
        userCreateRequestDto.setEmail("dheeraj@gmail.com");
        userCreateRequestDto.setPassword("dpassword");
        userController.createUser(userCreateRequestDto);

        UserUpdateRequestDto userUpdateRequestDto = new UserUpdateRequestDto();
        userUpdateRequestDto.setId(1);
        userUpdateRequestDto.setPassword("Hi");
        userController.updateUser(userUpdateRequestDto);

    }
}
