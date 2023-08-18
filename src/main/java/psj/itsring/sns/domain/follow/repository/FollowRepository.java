package psj.itsring.sns.domain.follow.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import psj.itsring.sns.domain.follow.entity.Follow;
import psj.itsring.sns.domain.member.entity.Member;

import java.util.List;

public interface FollowRepository extends JpaRepository<Follow, Long> {

    List<Long> findByFromMemberId(Long fromMemberId);

//    List<Member> findAllByAnyToMemberId(List<Long> followers);
}
