package com.example.tp2_partie2.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
@Entity
@ToString
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "USERS")
public class User {
    @Id
    private String userId;
    @Column(unique = true ,length = 20,name = "USER_NAME")
    private String userName;
    @Column(nullable = false)
    private String password;
    @ManyToMany(mappedBy = "users",fetch = FetchType.EAGER)
    private Collection <Role> roles=new ArrayList<>();

}
