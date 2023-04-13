package com.musinsa.demo.domain;
import com.musinsa.demo.common.audit.DateTimeEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "reward_policy")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorColumn(name = "policy_type") // todo : change to enum type
public abstract class RewardPolicy extends DateTimeEntity {
    @Id
    @Column(name = "reward_info_seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long rewardNo;

    @Column(name = "description")
    String description;

    @JoinColumn(name = "seq")
    @OneToMany(mappedBy = "reward_policy")
    List<RewardPolicyMatching> rewardPolicyMatchingList = new ArrayList<>();
}
