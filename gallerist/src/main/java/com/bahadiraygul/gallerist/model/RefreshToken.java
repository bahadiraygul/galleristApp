package com.bahadiraygul.gallerist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "refresh_token")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RefreshToken extends BaseEntity{

    @Column(name = "refresh_token")
    private String refreshToken;

    @Column(name = "expire_date")
    private Date expireDate;

    @ManyToOne
    private User user;
}
