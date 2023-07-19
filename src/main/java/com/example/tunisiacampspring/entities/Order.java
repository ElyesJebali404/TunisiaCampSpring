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
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_order;
    private float total_amount;
    @Temporal(TemporalType.DATE)
    private Date orderDate  ;
    @ManyToOne
    private User user;
    @OneToMany
    private Set<orderItem> orderItems;
}
