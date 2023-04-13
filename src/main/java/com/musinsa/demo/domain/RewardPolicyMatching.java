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

    @ManyToOne
    @JoinColumn(name = "reward_info_seq")
    RewardInfo rewardInfoSeq;

    @ManyToOne
    @JoinColumn(name = "reward_policy_seq")
    RewardPolicy rewardPolicySeq;
}
