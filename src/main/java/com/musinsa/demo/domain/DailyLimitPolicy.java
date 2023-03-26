package com.musinsa.demo.domain;
import javax.persistence.*;

@Entity
@Table(name = "daily_limit_policy")
public class DailyLimitPolicy {
    @Id
    @Column(name = "seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long seq;
    @Column(name = "day")
    Integer day;
    @Column(name = "limitCount")
    Integer limitCount;
}
