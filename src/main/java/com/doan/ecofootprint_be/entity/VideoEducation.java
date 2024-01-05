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
@Table(name = "video_education")
public class VideoEducation {
    @Id
    @Column(name = "id")
    private int id;


    @Column(name = "title")
    private  String title;

    @Column(name = "description")
    private String description;


    @Column(name = "video_url")
    private  String video_url;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Users users;
}
