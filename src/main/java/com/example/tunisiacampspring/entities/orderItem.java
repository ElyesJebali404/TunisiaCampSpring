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
public class orderItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_orderItem;
    private int quantity;
    private float unitPrice;
    private float totalPrice;
    @ManyToOne
    private Item item;
    @ManyToOne
    private Order order;
}
