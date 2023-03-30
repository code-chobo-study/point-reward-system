package com.musinsa.demo.domain;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name ="reward_policy_matching")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RewardPolicyMatching {
    @Id
    @Column(name = "seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long seq;

    @Column(name = "reward_info_seq")
    Long rewardInfoSeq;

    @Column(name = "reward_policy_seq")
    Long rewardPolicySeq;
}
