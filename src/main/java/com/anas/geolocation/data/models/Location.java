package com.anas.geolocation.data.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private Double lat;

    @Column
    private Double lon;

    @Column(name="user_id")
    private Integer userId;

    @Column(name="case_id")
    private Integer caseId;
}