package com.musinsa.demo.domain;

import com.musinsa.demo.common.audit.DateTimeEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "reward_accumulate_history")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RewardAccumulateHistory extends DateTimeEntity {
    @Id
    @Column(name = "history_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long historyId;
    @Column(name = "reward_seq")
    Long rewardSeq ;
    @Column(name = "user_no")
    Long userNo;
    @Column(name = "point")
    String point;
}
