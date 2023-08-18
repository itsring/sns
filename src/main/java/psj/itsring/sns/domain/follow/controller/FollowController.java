package psj.itsring.sns.domain.follow.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import psj.itsring.sns.domain.follow.entity.Follow;
import psj.itsring.sns.domain.follow.service.FollowReadService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/follow")
public class FollowController {

    @Autowired
    private static FollowReadService followReadService;

    @GetMapping("/followers/{fromMemberId}/{toMemberId}")
    public Page<Follow> getFollowers(@PathVariable Long fromMemberId, @PathVariable Long toMemberId) {

        Page<Follow> follows = followReadService.getFollowers(fromMemberId, toMemberId);

        return null;

    }

}
