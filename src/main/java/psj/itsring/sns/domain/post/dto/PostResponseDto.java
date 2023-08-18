package psj.itsring.sns.domain.post.dto;

import lombok.Builder;
import lombok.Getter;
import psj.itsring.sns.domain.post.dto.create.PostCreateRequestDto;
import psj.itsring.sns.domain.post.entity.Post;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class PostResponseDto {

    private Long id;
    private Long memberId;
    private String contents;
    private LocalDate createdDate;
    private LocalDateTime createdAt;

    public PostResponseDto() {
    }

    @Builder
    public PostResponseDto(Long id, Long memberId, String contents, LocalDate createdDate, LocalDateTime createdAt) {
        this.id = id;
        this.memberId = memberId;
        this.contents = contents;
        this.createdDate = createdDate;
        this.createdAt = createdAt;
    }

    public static PostResponseDto fromEntity(Post post) {
        PostResponseDto postResponseDto = PostResponseDto.builder()
                .id(post.getId())
                .memberId(post.getMemberId())
                .contents(post.getContents())
                .createdDate(post.getCreatedDate())
                .createdAt(post.getCreatedAt())
                .build();

        return postResponseDto;
    }
}
