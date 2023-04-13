package com.musinsa.demo.domain;
import javax.persistence.*;

@Entity
@Table(name = "daily_limit_policy")
@DiscriminatorValue("dl")
public class DailyLimitPolicy extends RewardPolicy{

    @Column(name = "day")
    Integer day;
    @Column(name = "limitCount")
    Integer limitCount;
}
