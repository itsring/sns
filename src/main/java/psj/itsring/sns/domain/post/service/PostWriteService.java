package psj.itsring.sns.domain.post.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import psj.itsring.sns.domain.post.dto.PostResponseDto;
import psj.itsring.sns.domain.post.dto.create.PostCreateRequestDto;
import psj.itsring.sns.domain.post.entity.Post;
import psj.itsring.sns.domain.post.repository.PostRepository;

@Service
@RequiredArgsConstructor
public class PostWriteService {

    final private PostRepository postRepository;


    public PostResponseDto create(PostCreateRequestDto postCreateRequestDto) {
        Post post = postCreateRequestDto.toEntity();
        
        return PostResponseDto.fromEntity(postRepository.save(post));
    }
}
