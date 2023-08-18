package psj.itsring.sns.util;

import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;
import psj.itsring.sns.domain.member.entity.Member;

public class RandomMember {

    //default seed
    static public Member create() {
        var param = new EasyRandomParameters();
        return new EasyRandom(param).nextObject(Member.class);
    }

    // test 객체를 어떻게 생성 할 것인가
    static public Member create(Long seed) {
        // 테스트 객체를 생성할 때 사용하는 라이브러리 EasyRandom
        // 테스트 객체파라미터 생성자
        var param = new EasyRandomParameters().seed(seed);
        // 파라미터를 넣고 생성할 객체의 class 를 넣으면 생성해 줌.
        return new EasyRandom(param).nextObject(Member.class);
    }

}
