package com.carwashmetro.carwashmetro.domain.reservation.ports;

import com.carwashmetro.carwashmetro.domain.reservation.Reservation;
import com.carwashmetro.carwashmetro.domain.reservation.value_objects.ReservationId;

public interface ReservationRepository {

    void save(Reservation reservation);
    Reservation findById(ReservationId reservationId);

}
