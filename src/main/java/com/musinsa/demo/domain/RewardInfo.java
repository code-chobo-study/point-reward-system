package com.musinsa.demo.domain;


import com.musinsa.demo.common.audit.DateTimeEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "reward_info")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RewardInfo extends DateTimeEntity {
    @Id
    @Column(name = "reward_info_seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long RewardInfoSeq;

    @Column(name = "title")
    String title;

    @Column(name = "cron_expression")
    String cronExpression;

    @Column(name = "policy_matching_no")
    Long policyMatchingIngNo;
}
