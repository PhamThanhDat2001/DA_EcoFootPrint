package com.doan.ecofootprint_be.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "food_consumption")
public class FoodConsumption {
    @Id
    @Column(name = "id")
    private int id;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date")
    private Date date;

    @Column(name = "food_item")
    private  String foodItem;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "unit")
    private  String unit;

    @Column(name = "description")
    private  String description;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private Users users;
@Column(name = "user_id")
private String userid;
}
