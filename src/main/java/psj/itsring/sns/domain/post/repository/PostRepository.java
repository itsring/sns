package psj.itsring.sns.domain.post.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import psj.itsring.sns.domain.post.entity.Post;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByMemberId(Long memberId);
}
