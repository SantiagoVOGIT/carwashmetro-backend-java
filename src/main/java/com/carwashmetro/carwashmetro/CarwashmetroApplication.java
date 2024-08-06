package com.carwashmetro.carwashmetro;

import com.carwashmetro.carwashmetro.domain.cell.Cell;
import com.carwashmetro.carwashmetro.domain.cell.CellFactory;
import com.carwashmetro.carwashmetro.domain.cell.value_objects.CellStatus;
import com.carwashmetro.carwashmetro.domain.cell.value_objects.SpaceNumber;
import com.carwashmetro.carwashmetro.domain.user.User;
import com.carwashmetro.carwashmetro.domain.user.value_objects.DniType;
import com.carwashmetro.carwashmetro.domain.user.value_objects.UserId;
import com.carwashmetro.carwashmetro.domain.user.value_objects.UserRole;
import com.carwashmetro.carwashmetro.domain.user.value_objects.UserStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shared.domain.CreatedAt;
import shared.domain.VehicleType;

@SpringBootApplication
public class CarwashmetroApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarwashmetroApplication.class, args);

        Cell cell1 = CellFactory.createCell(
                SpaceNumber.SPACE_ONE,
                VehicleType.CAR,
                CellStatus.MAINTENANCE
        );

        System.out.println(cell1.getId().value());
        System.out.println(cell1.getCellStatus());
        System.out.println(cell1.getSpaceNumber());


    }

}
