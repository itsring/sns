package psj.itsring.sns.domain.member.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import psj.itsring.sns.domain.member.entity.Member;
import psj.itsring.sns.domain.member.repository.MemberRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberReadService {

    final private MemberRepository memberRepository;

    public Member getOne(Long id) {
        Optional<Member> member = memberRepository.findById(id);
        if (member.isPresent()) {
            return member.get();
        }
        return null;
    }
}
