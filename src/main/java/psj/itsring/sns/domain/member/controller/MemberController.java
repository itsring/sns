package psj.itsring.sns.domain.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import psj.itsring.sns.domain.member.dto.signup.MemberSignUpRequestDto;
import psj.itsring.sns.domain.member.entity.Member;
import psj.itsring.sns.domain.member.service.MemberReadService;
import psj.itsring.sns.domain.member.service.MemberWriteService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private final MemberReadService memberReadService;
    @Autowired
    private final MemberWriteService memberWriteService;

    @GetMapping("/id/{id}")
    Member getMember(@PathVariable Long id) {
        Member member = memberReadService.getOne(id);
        return member;
    }

    @PostMapping("/sign-up")
    Member addMember(@RequestBody MemberSignUpRequestDto member) {
        return memberWriteService.signup(member);
    }

}
