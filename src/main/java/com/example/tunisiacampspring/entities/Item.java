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
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_product;
    private String title;
    private String price;
    private String quantity;
    @OneToMany
    private Set<orderItem> orderItems;

}