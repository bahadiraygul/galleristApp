package com.bahadiraygul.gallerist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Table(name = "gallerist_car",
uniqueConstraints = {@UniqueConstraint(columnNames = {"gallerist_id", "car_id"}, name = "uq_gallerist_car")})
@Data
@Entity
public class GalleristCar extends BaseEntity{


    @ManyToOne
    private Gallerist gallerist;

    @ManyToOne
    private Car car;
}
