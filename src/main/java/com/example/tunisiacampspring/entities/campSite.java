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
public class campSite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_campSite;
    private String name;
    private String location;
    private int nbrPlace;
    @OneToMany
    private Set<Reservation> reservations;
}