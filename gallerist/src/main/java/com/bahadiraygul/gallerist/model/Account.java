package com.bahadiraygul.gallerist.model;

import com.bahadiraygul.gallerist.enums.CurrencyType;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "account")
@Data
public class Account extends BaseEntity {

    @Column(name = "account_no")
    private String accountNo;

    @Column(name = "iban")
    private Long iban;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "currency_type")
    @Enumerated(EnumType.STRING)
    private CurrencyType currencyType;
}
