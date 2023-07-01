package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.Reservation;
import com.example.tunisiacampspring.repositories.reservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements IReservationService{
    @Autowired
    private reservationRepository reservationRepository;
    @Override
    public Reservation add_reservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation retreive_reservation(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public Reservation update_Reservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void delete_reservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
