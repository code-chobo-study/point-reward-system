package com.musinsa.demo.legacy.repository;

import com.musinsa.demo.common.enums.Status;
import com.musinsa.demo.legacy.domain.Reward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RewardRepository extends JpaRepository<Reward, Long> {
    Optional<Reward> findById(Long id);

    List<Reward> findAllByCronExpressionAndRewardStatus(String cronExpression, Status status);
}
