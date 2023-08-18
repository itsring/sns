package psj.itsring.sns.domain.post.dto.create;

import lombok.Builder;
import lombok.Getter;
import psj.itsring.sns.domain.post.entity.Post;

import java.time.LocalDate;

@Getter
public class PostCreateRequestDto {

    private Long memberId;

    private String contents;

    private LocalDate createdDate;

    public PostCreateRequestDto() {
    }

    @Builder
    public PostCreateRequestDto(Long memberId, String contents, LocalDate createdDate) {
        this.memberId = memberId;
        this.contents = contents;
        this.createdDate = createdDate == null ? LocalDate.now() : createdDate;
    }

    public Post toEntity() {
        Post post = Post.builder()
                .contents(this.getContents())
                .memberId(this.getMemberId())
                .createdDate(this.getCreatedDate())
                .build();
        return post;
    }
}
