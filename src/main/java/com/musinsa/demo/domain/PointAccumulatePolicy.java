package com.musinsa.demo.domain;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "point_accumulate_Policy")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PointAccumulatePolicy {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long seq;

    @Column(name = "accumulate_day")
    Integer accumulateDay;

    @Column(name = "additional_point")
    LocalDateTime additionalPoint;
}
