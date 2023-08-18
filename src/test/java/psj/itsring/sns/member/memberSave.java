package psj.itsring.sns.member;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import psj.itsring.sns.domain.member.entity.Member;
import psj.itsring.sns.util.RandomMember;

public class memberSave {

    @DisplayName("create member test")
    @Test
    public void testCreateMember() {
        //given
        Member member = RandomMember.create();
        //when
        
        //then
    }

}
