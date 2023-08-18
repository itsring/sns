package psj.itsring.sns.domain.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import psj.itsring.sns.domain.member.dto.signup.MemberSignUpRequestDto;
import psj.itsring.sns.domain.member.entity.Member;
import psj.itsring.sns.domain.member.repository.MemberRepository;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class MemberWriteService {

    final private MemberRepository memberRepository;

    public Member signup(MemberSignUpRequestDto memberSignUpRequestDto) {
        Member member = MemberSignUpRequestDto.toEntity(memberSignUpRequestDto);
        member = memberRepository.save(member);
        memberRepository.flush();
        if (member.equals(null)) {
            return null;
        }
        return member;
    }
}
