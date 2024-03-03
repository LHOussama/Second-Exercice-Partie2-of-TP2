package com.example.tp2_partie2.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
@Entity@AllArgsConstructor@NoArgsConstructor@ToString@Getter@Setter
public class Role {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,length = 20)
    private String roleName;
    @Column(name = "DESCRIPTION")
    private String desc;
    @ManyToMany(fetch = FetchType.EAGER)
    @ToString.Exclude
    private Collection <User> users=new ArrayList<>();
}
