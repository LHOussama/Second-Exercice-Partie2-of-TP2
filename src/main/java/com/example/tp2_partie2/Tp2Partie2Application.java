package com.example.tp2_partie2;
import com.example.tp2_partie2.Service.UserService;
import com.example.tp2_partie2.entities.Role;
import com.example.tp2_partie2.entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;
@SpringBootApplication
public class Tp2Partie2Application {
    public static void main(String[] args) {
        SpringApplication.
                run(Tp2Partie2Application.class, args);
    }
    @Bean
    CommandLineRunner start(UserService userService){
        return args -> {
            userService.addUser(User.builder().userName("user1").password("oussama").build());
            userService.addUser(User.builder().userName("admin").password("yassine 1998").build());
            Stream.of("STUDENT","USER","ADMIN").forEach(s -> {
                Role role=new Role();
                role.setRoleName(s);
                userService.addNewRole(role);
            });
            userService.addRoleToUser("user1","STUDENT");
            userService.addRoleToUser("user1","USER");
            userService.addRoleToUser("admin","USER");
            userService.addRoleToUser("admin","ADMIN");
            try{
                User user=userService.authentificate("user1","oussama");
                System.out.println(user.getUserId());
                user.getRoles().forEach(role ->
                    System.out.println(role));
            }catch(Exception e){
                    e.printStackTrace();
            }
        };
    }
}
