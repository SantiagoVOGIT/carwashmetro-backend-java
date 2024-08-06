package com.carwashmetro.carwashmetro.domain.cell;


import com.carwashmetro.carwashmetro.domain.cell.value_objects.CellId;
import com.carwashmetro.carwashmetro.domain.cell.value_objects.CellStatus;
import com.carwashmetro.carwashmetro.domain.cell.value_objects.SpaceNumber;
import shared.domain.CreatedAt;
import shared.domain.VehicleType;

public class CellFactory {

    public static Cell createCell(SpaceNumber spaceNumber, VehicleType vehicleType, CellStatus cellStatus){
        return new Cell(
                new CellId(),
                spaceNumber,
                vehicleType,
                cellStatus,
                new CreatedAt(CreatedAt.now().getValue())
        );
    }

}
