package com.example.tunisiacampspring.entities;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.*;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_user;
    private String fName;
    private String lName;
    private String Username ;
    private String Password ;
    private long tel;
    private String email;
    private Role role;
    @OneToMany
    private Set<Reservation> reservations;
}