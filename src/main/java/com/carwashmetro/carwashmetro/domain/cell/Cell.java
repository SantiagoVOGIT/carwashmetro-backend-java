package com.carwashmetro.carwashmetro.domain.cell;


import com.carwashmetro.carwashmetro.domain.cell.value_objects.CellId;
import com.carwashmetro.carwashmetro.domain.cell.value_objects.CellStatus;
import com.carwashmetro.carwashmetro.domain.cell.value_objects.SpaceNumber;
import shared.domain.CreatedAt;
import shared.domain.VehicleType;

public class Cell {

    private final CellId id;

    private final SpaceNumber spaceNumber;

    private final VehicleType vehicleType;

    private final CellStatus cellStatus;

    private final CreatedAt createdAt;

    public Cell(CellId id, SpaceNumber spaceNumber, VehicleType vehicleType, CellStatus cellStatus, CreatedAt createdAt) {
        this.id = id;
        this.spaceNumber = spaceNumber;
        this.vehicleType = vehicleType;
        this.cellStatus = cellStatus;
        this.createdAt = createdAt;
    }

    public CellId getId() {
        return id;
    }

    public SpaceNumber getSpaceNumber() {
        return spaceNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public CellStatus getCellStatus() {
        return cellStatus;
    }

    public CreatedAt getCreatedAt() {
        return createdAt;
    }

}
