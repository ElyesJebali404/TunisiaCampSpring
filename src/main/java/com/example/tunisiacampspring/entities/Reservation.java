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
public class Reservation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_reservation;
    @Temporal(TemporalType.DATE)
    private Date startDate  ;
    @Temporal(TemporalType.DATE)
    private Date endDate  ;
    @ManyToOne
    private User user;
    @ManyToOne
    private campSite campSite;
    @ManyToMany
    private Set<Activity> activities;

}
