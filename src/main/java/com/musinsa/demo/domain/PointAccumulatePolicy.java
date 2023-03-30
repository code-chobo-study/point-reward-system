package com.musinsa.demo.domain;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "point_accumulate_Policy")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PointAccumulatePolicy extends RewardPolicy{

    @Column(name = "accumulate_day")
    Integer accumulateDay;

    @Column(name = "additional_point")
    LocalDateTime additionalPoint;
}
