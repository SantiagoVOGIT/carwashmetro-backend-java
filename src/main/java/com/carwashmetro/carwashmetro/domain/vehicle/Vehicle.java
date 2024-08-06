package com.carwashmetro.carwashmetro.domain.vehicle;

import com.carwashmetro.carwashmetro.domain.user.value_objects.UserId;
import com.carwashmetro.carwashmetro.domain.vehicle.value_objects.VehicleId;
import shared.domain.CreatedAt;
import shared.domain.VehicleType;

public class Vehicle {

    private VehicleId vehicleId;

    private UserId userId;

    private String licensePlate;

    private String model;

    private VehicleType vehicleType;

    private CreatedAt createdAt;

}
