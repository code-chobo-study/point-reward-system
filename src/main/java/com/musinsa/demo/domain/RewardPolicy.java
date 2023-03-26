package com.musinsa.demo.domain;
import com.musinsa.demo.common.audit.DateTimeEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "reward_policy")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RewardPolicy extends DateTimeEntity {
    @Id
    @Column(name = "reward_info_seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long rewardNo;

    @Column(name = "detail_seq")
    Long detailSeq;

    @Column(name = "description")
    String description;
}