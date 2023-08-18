package psj.itsring.sns.domain.follow.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Getter
@Entity
@Table(name="follow")
@NoArgsConstructor
public class Follow {

    @Id
    private Long id;

    @Column
    private Long fromMemberId;

    @Column
    private Long toMemberId ;

    @Column
    private LocalDateTime createdAt ;

    @Builder
    public Follow(Long id, Long fromMemberId, Long toMemberId, LocalDateTime createdAt) {
        this.id = id;
        this.fromMemberId = fromMemberId;
        this.toMemberId = toMemberId;
        this.createdAt = createdAt == null ? LocalDateTime.now() : createdAt;
    }

}
