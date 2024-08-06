package com.carwashmetro.carwashmetro.domain.reservation;

import com.carwashmetro.carwashmetro.domain.cell.value_objects.CellId;
import com.carwashmetro.carwashmetro.domain.reservation.value_objects.ReservationCode;
import com.carwashmetro.carwashmetro.domain.reservation.value_objects.ReservationId;
import com.carwashmetro.carwashmetro.domain.reservation.value_objects.ReservationStatus;
import com.carwashmetro.carwashmetro.domain.user.value_objects.UserId;
import com.carwashmetro.carwashmetro.domain.vehicle.value_objects.VehicleId;
import shared.domain.CreatedAt;

import java.time.OffsetDateTime;

public class Reservation {

    private ReservationId id;

    private UserId userId;

    private CellId cellId;

    private VehicleId vehicleId;

    private ReservationCode reservationCode;

    private ReservationStatus reservationStatus;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    private CreatedAt createdAt;

}
