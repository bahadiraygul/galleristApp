package com.bahadiraygul.gallerist.model;

import com.bahadiraygul.gallerist.enums.CarStatusType;
import com.bahadiraygul.gallerist.enums.CurrencyType;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Table(name = "car")
@Data
@Entity
public class Car extends BaseEntity{

    @Column(name = "plaka")
    private String plaka;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "production")
    private Integer production;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "currency_type")
    @Enumerated(EnumType.STRING)
    private CurrencyType currencyType;

    @Column(name = "damage_price")
    private BigDecimal damagePrice;

    @Column(name = "car_status_type")
    private CarStatusType carStatusType;
}
