package psj.itsring.sns.domain.member.dto.signup;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import psj.itsring.sns.domain.member.entity.Member;

import java.time.LocalDate;


@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberSignUpRequestDto {

    private String nickname;
    private String email;
    private LocalDate birthday;

    public static Member toEntity(MemberSignUpRequestDto memberSignUpRequestDto) {
        Member member = Member.builder()
                .nickname(memberSignUpRequestDto.getNickname())
                .email(memberSignUpRequestDto.getEmail())
                .birthday(memberSignUpRequestDto.getBirthday())
                .build();

        return member;
    }

}
