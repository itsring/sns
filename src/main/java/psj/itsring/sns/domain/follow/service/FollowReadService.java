package psj.itsring.sns.domain.follow.service;


import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import psj.itsring.sns.domain.follow.entity.Follow;
import psj.itsring.sns.domain.follow.repository.FollowRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FollowReadService {

    final private FollowRepository followRepository;

    public Page<Follow> getFollowers(Long fromMemberId, Long toMemberId) {
        List<Long> followers = followRepository.findByFromMemberId(fromMemberId);
//        followRepository.findAllByAnyToMemberId(followers);

        return null;
    }


}
