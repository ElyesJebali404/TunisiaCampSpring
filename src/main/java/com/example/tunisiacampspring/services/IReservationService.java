package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.Reservation;

public interface IReservationService {
    public Reservation add_reservation(Reservation reservation);
    public Reservation retreive_reservation(Long id);
    public Reservation update_Reservation(Reservation reservation);
    public void delete_reservation(Long id );
}