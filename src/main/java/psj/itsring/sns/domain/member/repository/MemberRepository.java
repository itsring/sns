package psj.itsring.sns.domain.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import psj.itsring.sns.domain.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {



}
