package com.carwashmetro.carwashmetro.domain.cell.ports;

import com.carwashmetro.carwashmetro.domain.cell.Cell;
import com.carwashmetro.carwashmetro.domain.cell.value_objects.CellId;

public interface CellRepository {

    void save(Cell cell);

    Cell findById(CellId cellId);


}
