package com.carwashmetro.carwashmetro.domain.vehicle.ports;

import com.carwashmetro.carwashmetro.domain.vehicle.Vehicle;
import com.carwashmetro.carwashmetro.domain.vehicle.value_objects.VehicleId;

public interface VehicleRepository {

    void save(Vehicle vehicle);

    Vehicle findById(VehicleId vehicleId);

}
