package com.musinsa.demo.domain;
import com.musinsa.demo.common.audit.DateTimeEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends DateTimeEntity {
    @Id
    @Column(name = "user_no")
    @GeneratedValue
    Long userNo;
    @Column(name = "user_id")
    String userId;
}
