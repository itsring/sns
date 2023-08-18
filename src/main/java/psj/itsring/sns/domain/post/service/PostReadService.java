package psj.itsring.sns.domain.post.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import psj.itsring.sns.domain.post.dto.PostResponseDto;
import psj.itsring.sns.domain.post.entity.Post;
import psj.itsring.sns.domain.post.repository.PostRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostReadService {

    final private PostRepository postRepository;

    public List<PostResponseDto> getPosts(Long memberId) {
        List<Post> posts = postRepository.findAllByMemberId(memberId);

        return posts.stream().map(PostResponseDto::fromEntity).collect(Collectors.toList());
    }
}
