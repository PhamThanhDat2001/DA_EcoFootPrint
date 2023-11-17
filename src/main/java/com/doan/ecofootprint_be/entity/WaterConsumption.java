package com.doan.ecofootprint_be.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "water_consumption")
public class WaterConsumption {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private Date date;

    @Column(name = "usage_type")
    private  String usageType;

    @Column(name = "consumption")
    private BigDecimal consumption;

    @Column(name = "unit")
    private  String unit;

    @Column(name = "description")
    private  String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
}