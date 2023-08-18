package psj.itsring.sns.post;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;
import psj.itsring.sns.domain.member.entity.Member;
import psj.itsring.sns.domain.post.entity.Post;
import psj.itsring.sns.domain.post.repository.PostRepository;
import psj.itsring.sns.util.PostFixtureFactory;
import psj.itsring.sns.util.RandomMember;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootTest
public class postSave {

    @Autowired
    private PostRepository postRepository;

    @DisplayName("bulk create post test")
    @Test
    public void testCreateMember() {
        //given
        var easyRandom = PostFixtureFactory.get(
                4L,
                LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 2, 1)
        );

        var stopWarch = new StopWatch();
        stopWarch.start();

        var posts = IntStream.range(0, 10000)
                .parallel()
                .mapToObj(i -> easyRandom.nextObject(Post.class))
                .collect(Collectors.toList());

        stopWarch.stop();
        System.out.println("객체 생성 시간 : " + stopWarch.getTotalTimeMillis());

        //when

        //then
        postRepository.saveAll(posts);
    }
}
