package com.example.tp2_partie2.Repositories;
import com.example.tp2_partie2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findUserByUserName(String UserName);

}
